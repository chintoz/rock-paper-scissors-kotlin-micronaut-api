package es.menasoft.rockpaperscissorkotlinapi.game;

import java.util.Collection;

public interface GameService {
    PlayerResultedRound play(PlayerRound round);

    Collection<PlayerResultedRound> list(String id);
}
