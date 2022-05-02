package es.menasoft.rockpaperscissorkotlinapi.game;

import lombok.Getter;

public enum Level {
    EASY(new FixedStrategy()), MID(new RandomStrategy()), HARD(new RandomStrategy());
    private final GameStrategy gameStrategy;

    Level(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public GameStrategy getGameStrategy() {
        return this.gameStrategy;
    }
}