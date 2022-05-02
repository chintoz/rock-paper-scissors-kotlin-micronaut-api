package es.menasoft.rockpaperscissorkotlinapi.game;

import jakarta.inject.Singleton;

import java.util.*;

@Singleton
public class GameRepositoryImpl implements GameRepository {

    private static Map<String, List<PlayerResultedRound>> data = new HashMap<>();

    @Override
    public PlayerResultedRound save(PlayerResultedRound round) {
        data.putIfAbsent(round.id(), new ArrayList<>());
        data.get(round.id()).add(round);
        return round;
    }

    @Override
    public Collection<PlayerResultedRound> findByPlayer(String id) {
        return data.getOrDefault(id, Collections.emptyList());
    }
}
