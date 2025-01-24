package com.bootcamp.dslist.services;


import com.bootcamp.dslist.dto.GameDto;
import com.bootcamp.dslist.dto.GameMinDTO;
import com.bootcamp.dslist.entities.Game;
import com.bootcamp.dslist.projections.GameMinProjection;
import com.bootcamp.dslist.reporsitory.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDto findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDto dto = new GameDto(result);
        return  dto;
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> finAll(){
        var result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }


}
