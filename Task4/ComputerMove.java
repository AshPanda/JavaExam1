package Task4;

public class ComputerMove {
    public static GameMove getComputerMove() {

        GameMove computerMove = GameMove.random();
        System.out.println("Выбор компьютера: " + computerMove.getValue());
        return computerMove;
    }
}
