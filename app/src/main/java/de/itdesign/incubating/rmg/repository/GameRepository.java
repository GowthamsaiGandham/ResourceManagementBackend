package de.itdesign.incubating.rmg.repository;
import  de.itdesign.incubating.rmg.model.*;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface GameRepository {
    Collection<ProjectPlan> getProjectPlanes();
}
