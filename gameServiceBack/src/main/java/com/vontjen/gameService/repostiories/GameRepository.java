package com.vontjen.gameService.repostiories;

import com.vontjen.gameService.model.Game;

import java.util.List;

public interface GameRepository {

    Game findById(String id);

    Game create (Game g);

    void remove(Long id);

    Game findByTitle(String title);

    List<Game> findAll();

    Long countAll();

}
