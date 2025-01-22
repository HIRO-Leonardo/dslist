package com.bootcamp.dslist.services;


import com.bootcamp.dslist.dto.GameMinDTO;
import com.bootcamp.dslist.entities.Game;
import com.bootcamp.dslist.reporsitory.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    public List<GameMinDTO> finAll(){
        var result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
