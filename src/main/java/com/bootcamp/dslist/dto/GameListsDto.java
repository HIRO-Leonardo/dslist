package com.bootcamp.dslist.dto;

import com.bootcamp.dslist.entities.Game;
import com.bootcamp.dslist.entities.GameList;

public class GameListsDto {
    private Long id;
    private String name;

    public GameListsDto(){

    }

    public GameListsDto(GameList entitiy) {
        id = entitiy.getId();
        name = entitiy.getName();
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }
}
