package es.menasoft.rockpaperscissorkotlinapi.game;

import java.util.Random;

public class RandomStrategy implements GameStrategy {
    @Override
    public BasicHand playHand() {
        Random random = new Random(System.currentTimeMillis());
        return BasicHand.values()[random.nextInt(BasicHand.values().length)];
    }
}
