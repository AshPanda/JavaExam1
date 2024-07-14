import java.util.Random;

public class ComputerMove {
    public static String getComputerMove() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        String computerMove = GameMove.values()[randomNumber].getValue();
        System.out.println("Выбор компьютера: " + computerMove);
        return computerMove;
    }
}
