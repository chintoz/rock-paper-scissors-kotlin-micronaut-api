package es.menasoft.rockpaperscissorkotlinapi.game;

import io.micronaut.http.annotation.*;

import java.util.Collection;

@Controller("/round")
class GameController {

    private final GameService gameService;

    GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @Post
    public PlayerResultedRound play(@Body PlayerRound playerRound) {
        return gameService.play(playerRound);
    }

    @Get("/{id}")
    Collection<PlayerResultedRound> getRounds(@QueryValue String id) {
        return gameService.list(id);
    }

}

