package es.menasoft.rockpaperscissorkotlinapi.game;

import es.menasoft.rockpaperscissorkotlinapi.player.PlayerRepository;
import jakarta.inject.Singleton;

import java.time.LocalDateTime;
import java.util.Collection;

@Singleton
public class GameServiceImpl implements GameService {

    private final PlayerRepository playerRepository;
    private final GameRepository gameRepository;

    public GameServiceImpl(PlayerRepository playerRepository, GameRepository gameRepository) {
        this.playerRepository = playerRepository;
        this.gameRepository = gameRepository;
    }

    @Override
    public PlayerResultedRound play(PlayerRound round) {
        if (playerRepository.findById(round.id()).isEmpty()) {
            throw new IllegalArgumentException("Player Not Found");
        }
        BasicHand opponentHand = round.level().getGameStrategy().playHand();
        Result result = round.hand().evaluate(opponentHand);
        return new PlayerResultedRound(round.id(), round.hand(), result, opponentHand, LocalDateTime.now());
    }

    @Override
    public Collection<PlayerResultedRound> list(String id) {
        if (playerRepository.findById(id).isEmpty()) {
            throw new IllegalArgumentException("Player Not Found");
        }
        return gameRepository.findByPlayer(id);
    }
}
