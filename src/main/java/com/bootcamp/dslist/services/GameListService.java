package com.bootcamp.dslist.services;


import com.bootcamp.dslist.dto.GameDto;
import com.bootcamp.dslist.dto.GameListsDto;
import com.bootcamp.dslist.dto.GameMinDTO;
import com.bootcamp.dslist.entities.Game;
import com.bootcamp.dslist.entities.GameList;
import com.bootcamp.dslist.reporsitory.GameListRepository;
import com.bootcamp.dslist.reporsitory.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListsDto> finAll(){
        var result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListsDto(x)).toList();

    }
}
