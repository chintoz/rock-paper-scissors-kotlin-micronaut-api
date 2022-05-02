package es.menasoft.rockpaperscissorkotlinapi.player;

import java.util.Collection;
import java.util.Optional;

public interface PlayerRepository {

    Player save(Player player);
    Collection<Player> findAll();
    Optional<Player> findById(String id);
    void delete(String id);

}
