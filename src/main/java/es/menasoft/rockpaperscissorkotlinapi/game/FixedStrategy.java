package es.menasoft.rockpaperscissorkotlinapi.game;

import static es.menasoft.rockpaperscissorkotlinapi.game.BasicHand.ROCK;

public class FixedStrategy implements GameStrategy {
    @Override
    public BasicHand playHand() {
        return ROCK;
    }
}
