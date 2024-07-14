//Камень-ножницы-бумага
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

import java.util.Arrays;
import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerScore = 0;
        int computerScore = 0;

        System.out.println("Игра камень-ножницы-бумага! Введите \"К\" за камень, \"Н\" за ножницы, \"Б\" за бумагу. Победитель будет известен после 5 раунда!");
        for (int i = 0; i < 5; i = i + 1) {

            System.out.println("-------------------------");
            System.out.print("Введите свой выбор: ");
            String playerMove = scanner.nextLine();

            if (Arrays.stream(GameMove.values()).noneMatch(x -> x.getValue().equals(playerMove))) {
                System.out.println("Неверное значение!");
                continue;
            }

            String computerMove = ComputerMove.getComputerMove();

            if (playerMove.equals(computerMove)) {
                System.out.println("Ничья!");
            } else if (Winner.isPlayerWinning(playerMove, computerMove) && playerMove.equals(GameMove.ROCK.getValue())) {
                System.out.println("Вы выиграли в этом раунде!");
                playerScore = playerScore + 1;
            } else if (Winner.isPlayerWinning(playerMove, computerMove) && playerMove.equals(GameMove.SCISSORS.getValue())) {
                System.out.println("Вы выиграли в этом раунде!");
                playerScore = playerScore + 2;
            } else if (Winner.isPlayerWinning(playerMove, computerMove) && playerMove.equals(GameMove.PAPER.getValue())) {
                System.out.println("Вы выиграли в этом раунде!");
                playerScore = playerScore + 5;
            } else if (!Winner.isPlayerWinning(playerMove, computerMove) && computerMove.equals(GameMove.ROCK.getValue())) {
                System.out.println("Вы проиграли в этом раунде!");
                computerScore = computerScore + 1;
            } else if (!Winner.isPlayerWinning(playerMove, computerMove) && computerMove.equals(GameMove.SCISSORS.getValue())) {
                System.out.println("Вы проиграли в этом раунде!");
                computerScore = computerScore + 2;
            } else {
                System.out.println("Вы проиграли в этом раунде!");
                computerScore = computerScore + 5;
            }
        }
        if (computerScore > playerScore) {
            System.out.println("Игра закончилась! Победитель: Компьютер с количеством очков = " + computerScore);
        } else if (playerScore == computerScore) {
            System.out.println("Игра закончилась! Ничья, количество очков = " + playerScore);
        } else {
            System.out.println("Игра закончилась! Победитель: Пользователь с количеством очков = " + playerScore);
        }
    }
}
