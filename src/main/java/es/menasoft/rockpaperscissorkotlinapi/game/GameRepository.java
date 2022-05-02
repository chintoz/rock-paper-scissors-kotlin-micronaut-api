package es.menasoft.rockpaperscissorkotlinapi.game;

import java.util.Collection;

public interface GameRepository {

    PlayerResultedRound save(PlayerResultedRound round);

    Collection<PlayerResultedRound> findByPlayer(String id);
}
