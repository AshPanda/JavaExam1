package Task4;

public class Winner {
    public static boolean isPlayerWinning(GameMove playerMove, GameMove computerMove) {
        return switch (playerMove) {
            case ROCK -> computerMove == GameMove.SCISSORS;
            case SCISSORS -> computerMove == GameMove.PAPER;
            case PAPER -> computerMove == GameMove.ROCK;
            case UNKNOWN -> false;
        };
    }
}
