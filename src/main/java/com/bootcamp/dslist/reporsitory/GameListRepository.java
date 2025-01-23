package com.bootcamp.dslist.reporsitory;


import com.bootcamp.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,Long> {
    
}
