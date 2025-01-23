package com.bootcamp.dslist.controller;

import com.bootcamp.dslist.dto.GameDto;
import com.bootcamp.dslist.dto.GameListsDto;
import com.bootcamp.dslist.dto.GameMinDTO;
import com.bootcamp.dslist.services.GameListService;
import com.bootcamp.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListsController {

    @Autowired
    private GameListService gameListService;



    @GetMapping
    public List<GameListsDto> findAll(){
        List<GameListsDto> result;
        result = gameListService.finAll();
        return result;
    }


}
