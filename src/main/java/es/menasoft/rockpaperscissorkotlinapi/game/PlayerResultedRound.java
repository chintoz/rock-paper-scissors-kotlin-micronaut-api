package es.menasoft.rockpaperscissorkotlinapi.game;

import java.time.LocalDateTime;

public record PlayerResultedRound(String id, BasicHand hand, Result result,
                                  BasicHand opponentHand, LocalDateTime time) {
}
