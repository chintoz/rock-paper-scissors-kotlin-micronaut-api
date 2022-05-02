package es.menasoft.rockpaperscissorkotlinapi.player;

import jakarta.inject.Singleton;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Singleton
public class PlayerRepositoryImpl implements PlayerRepository {

    private static Map<String, Player> data = new HashMap<>();

    @Override
    public Player save(Player player) {
        data.put(player.id(), player);
        return data.get(player.id());
    }

    @Override
    public Collection<Player> findAll() {
        return data.values();
    }

    @Override
    public Optional<Player> findById(String id) {
        return Optional.ofNullable(data.get(id));
    }

    @Override
    public void delete(String id) {
        data.remove(id);
    }
}
