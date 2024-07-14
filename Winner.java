public class Winner {
    public static boolean isPlayerWinning(String playerMove, String computerMove) {
        return playerMove.equals(GameMove.ROCK.getValue()) && computerMove.equals(GameMove.SCISSORS.getValue())
                || (playerMove.equals(GameMove.SCISSORS.getValue()) && computerMove.equals(GameMove.PAPER.getValue()))
                || (playerMove.equals(GameMove.PAPER.getValue()) && computerMove.equals(GameMove.ROCK.getValue()));
    }
}
