package de.itdesign.incubating.rmg.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        // Enable WebSocket MessageBroker
        config.enableSimpleBroker("/topic");
        // Prefix for sending messages to the server from client
        config.setApplicationDestinationPrefixes("/app");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // Register the "/ws" endpoint for WebSocket connections Establishment
        registry.addEndpoint("/rmg").setAllowedOrigins("http://localhost:5173/").withSockJS();
//        registry.addEndpoint("/rmg").setAllowedOrigins("http://localhost:3000").withSockJS();
    }
}
