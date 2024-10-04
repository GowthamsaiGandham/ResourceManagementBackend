package de.itdesign.incubating.rmg.service;

import de.itdesign.incubating.rmg.model.Game;

import de.itdesign.incubating.rmg.model.ResourceCard;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
@Service
public class GameService {

    private final Game game;

    public GameService() {
        this.game = new Game("Game1"); // Manual instantiation without @Autowired
    }

    public Collection<ResourceCard> getResourcesOfB1(){
        Collection<ResourceCard> resourceCards = game.getCards();
        Collection<ResourceCard> board1Resources = new ArrayList<>();
        for(ResourceCard each : resourceCards){
            if(each.homeBoardId().equals("B1")){
                board1Resources.add(each);
            }
            else{
                continue;
            }
        }
        return board1Resources;
    }

    public Collection<ResourceCard> getResourcesOfB2(){
        Collection<ResourceCard> resourceCards = game.getCards();
        Collection<ResourceCard> board2Resources = new ArrayList<>();
        for(ResourceCard each : resourceCards){
            if(each.homeBoardId().equals("B2")){
                board2Resources.add(each);
            }
            else{
                continue;
            }
        }
        return board2Resources;
    }

}