package de.itdesign.incubating.rmg.service;

import de.itdesign.incubating.rmg.model.Player;

import de.itdesign.incubating.rmg.model.ResourceBoard;
import de.itdesign.incubating.rmg.model.ResourceCard;
import de.itdesign.incubating.rmg.model.Role;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ResourceBoardService {

    List<ResourceBoard> resourceBoards = new ArrayList<>();
    GameService gameService;

    public ResourceBoardService(){
        this.gameService = new GameService();
        resourceBoards.add(new ResourceBoard("RB1","B1",new Player("player1", Role.RM,"George",List.of(100)),gameService.getResourcesOfB1()));
        resourceBoards.add(new ResourceBoard("RB2","B2",new Player("player4",Role.RM,"Emma",List.of(40)),gameService.getResourcesOfB2()));

    }

    public ResourceBoard getResourceBoardById(String boardId){
            ResourceBoard existingResourceBoard = null;
            for(ResourceBoard each : resourceBoards){
                if(each.getId().equals(boardId)){
                    existingResourceBoard =  each;
                }
            }
            System.out.println(existingResourceBoard);
        System.out.println(existingResourceBoard);

            return existingResourceBoard;
    }

    //Get players data from resource board
    public Player getPlayers(String boardId){
        Player playerData=null;
        for(ResourceBoard each:resourceBoards){
            if(each.getId().equals(boardId)){
               playerData= each.getOwner();
            }
        }
        return playerData;


    }

    //Get all resources from resource board
    public Collection<ResourceCard> getAllResources(String boardId){
        Collection<ResourceCard> resourceCard=null;
        for(ResourceBoard data:resourceBoards){
            if(data.getId().equals(boardId)){
                resourceCard=data.getResources();
            }
        }
        return resourceCard;

    }

}
