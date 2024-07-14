package Task4;

import java.util.Random;

public enum GameMove {
    ROCK("К", 1),
    SCISSORS("Н", 2),
    PAPER("Б", 5),
    UNKNOWN("", 0);

    private final String value;
    private final int score;
    private static final Random rnd = new Random();

    GameMove(String value, int score) {
        this.value = value;
        this.score = score;
    }

    public String getValue() {
        return value;
    }

    public int getScore() {
        return score;
    }

    public static GameMove lookup(String s) {
        for (GameMove gm : values()) {
            if (gm.value.equals(s)) {
                return gm;
            }
        }
        return UNKNOWN;
    }

    public static GameMove random() {
        return values()[rnd.nextInt(UNKNOWN.ordinal() - 1)];
    }
}

