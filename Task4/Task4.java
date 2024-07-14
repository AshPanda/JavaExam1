package Task4;//Камень-ножницы-бумага
//Напишите консольное приложение, которое играет с пользователем в камень-ножницы-бумагу.
//        Требования:
//Пользователь вводит значение через консоль
//К - камень
//Н - ножницы
//Б - бумага
//Программа выбирает свой вариант случайным образом
//Игра состоит из 5 раундов
//Баллы считаются по формуле ниже.
//По итогу 5 раундов, программа пишет счет и объявляет победителя. Конец игры.
//Как считать баллы:
//Если сторона одержала победу с помощью камня (К), победитель получает 1 балл
//Если сторона одержала победу с помощью ножниц (Н), победитель получает 2 балла
//Если сторона одержала победу с помощью бумаги (Б), победитель получает 5 баллов

import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerScore = 0;
        int computerScore = 0;

        System.out.println("Игра камень-ножницы-бумага! Введите \"К\" за камень, \"Н\" за ножницы, \"Б\" за бумагу. Победитель будет известен после 5 раунда!");
        for (int i = 0; i < 5; i++) {

            System.out.println("-------------------------");

            GameMove playerMove = null;
            for (; ; ) {
                System.out.print("Введите свой выбор: ");
                String playerInput = scanner.nextLine();

                playerMove = GameMove.lookup(playerInput);
                if (playerMove == GameMove.UNKNOWN) {
                    System.out.println("Введено не верное значение! Введите заново");
                } else {
                    break;
                }
            }
            GameMove computerMove = ComputerMove.getComputerMove();

            if (playerMove == computerMove) {
                System.out.println("Ничья!");
            } else if (Winner.isPlayerWinning(playerMove, computerMove)) {
                System.out.println("Вы выиграли в этом раунде!");
                playerScore += playerMove.getScore();
            } else {
                System.out.println("Вы проиграли в этом раунде!");
                computerScore += computerMove.getScore();
            }
        }
        if (computerScore > playerScore) {
            System.out.printf("Игра закончилась! Победитель: Компьютер с количеством очков = %d%n", computerScore);
        } else if (playerScore == computerScore) {
            System.out.printf("Игра закончилась! Ничья, количество очков = %d%n", playerScore);
        } else {
            System.out.printf("Игра закончилась! Победитель: Пользователь с количеством очков = %d%n", playerScore);
        }
    }
}
