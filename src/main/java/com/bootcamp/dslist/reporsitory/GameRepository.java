package com.bootcamp.dslist.reporsitory;

import com.bootcamp.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
    
}
