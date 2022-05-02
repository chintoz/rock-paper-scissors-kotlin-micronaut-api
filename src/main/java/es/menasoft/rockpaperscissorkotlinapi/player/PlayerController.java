package es.menasoft.rockpaperscissorkotlinapi.player;

import io.micronaut.http.annotation.*;

import java.util.Collection;

@Controller("/player")
public class PlayerController {

    private final PlayerRepository playerRepository;

    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Post
    public Player createPlayer(@Body Player player) {
        return playerRepository.save(player);
    }

    @Get
    public Collection<Player> getPlayers() {
        return playerRepository.findAll();
    }

    @Get("/{id}")
    public Player getPlayer(@QueryValue("id") String id) {
        return playerRepository.findById(id).orElse(null);
    }

    @Delete("/{id}")
    public void deletePlayer(@QueryValue String id) {
        playerRepository.delete(id);
    }
}
