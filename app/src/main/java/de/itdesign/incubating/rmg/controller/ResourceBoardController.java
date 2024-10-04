package de.itdesign.incubating.rmg.controller;


import de.itdesign.incubating.rmg.model.Player;
import de.itdesign.incubating.rmg.model.ResourceBoard;
import de.itdesign.incubating.rmg.model.ResourceCard;
import de.itdesign.incubating.rmg.service.ResourceBoardService;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Collection;


@Controller
public class ResourceBoardController {



    public   ResourceBoardService resourceBoardService;

    public ResourceBoardController() {
        this.resourceBoardService = new ResourceBoardService();
    }


    @MessageMapping("/getResourceBoard")
    @SendTo("/topic/resourceBoard")
    public ResourceBoard getResourceBoardById(String id){
        System.out.println("excecuted");
       return resourceBoardService.getResourceBoardById(id);

    }


    //Get players from specific resource board
    @MessageMapping("/getPlayers")
    @SendTo("/topic/player")
    public Player getPlayers(String id){
        System.out.println("player data");
        return resourceBoardService.getPlayers(id);

    }


    //Get all resources from Resource board
    @MessageMapping("/getResources")
    @SendTo("/topic/resources")
    public Collection<ResourceCard> getAllResources(String id){
        return resourceBoardService.getAllResources(id);
    }

}
