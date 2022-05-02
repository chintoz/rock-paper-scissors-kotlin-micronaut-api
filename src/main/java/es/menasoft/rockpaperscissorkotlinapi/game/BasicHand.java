package es.menasoft.rockpaperscissorkotlinapi.game;

import java.util.function.Predicate;

import static es.menasoft.rockpaperscissorkotlinapi.game.Result.*;

public enum BasicHand {
    ROCK, PAPER, SCISSOR;

    static {
        ROCK.isWinner = t -> t == SCISSOR;
        PAPER.isWinner = t -> t == ROCK;
        SCISSOR.isWinner = t -> t == PAPER;
    }
    private Predicate<BasicHand> isWinner;

    public Result evaluate(BasicHand opponentHand) {
        if (this.isWinner.test(opponentHand)) {
            return WIN;
        } else if (opponentHand.isWinner.test(this)) {
            return LOSE;
        }
        return TIED;
    }
}