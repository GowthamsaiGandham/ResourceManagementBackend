package de.itdesign.incubating.rmg.controller;


import de.itdesign.incubating.rmg.model.ResourceBoard;
import de.itdesign.incubating.rmg.service.ResourceBoardService;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;



@Controller
public class ResourceBoardController {

    private final ResourceBoardService resourceBoardService;

    public ResourceBoardController() {
        this.resourceBoardService = new ResourceBoardService();
    }


    @MessageMapping("/getResourceBoard")
    @SendTo("/topic/resourceBoard")
    public ResourceBoard getResourceBoardById(String id){
        System.out.println("excecuted");
       return resourceBoardService.getResourceBoardById(id);

    }

    @MessageMapping("/greeting")
    @SendTo("/topic/greet")
    public String getGreeting(){
        System.out.println("hello");
        return "Hello World";
    }

}
