import java.util.Scanner;

//Мальчик хочет написать на заборе признание в любви девочке из пятнадцати букв и трех пробелов.
//На каждые три буквы мальчик тратит по 62 см длины забора, а на каждый пробел - 12 см.
//Напишите программу, которая поможет по длине забора (введенной пользователем) выяснить,
//поместится ли на забор такой длины надпись мальчика.

public class Task1 {
    public static void main(String[] args) {
        int idealFenceLength = 15 / 3 * 62 + 3 * 12;
        System.out.println("Введите длину забора в сантиметрах:");
        Scanner userInput = new Scanner(System.in);
        final String input = userInput.nextLine();
        int userFenceLength;
        try {
            userFenceLength = Integer.parseInt(input);

            if (userFenceLength >= idealFenceLength) {
                System.out.println("Надпись поместится на заборе");

            } else {
                System.out.println("Надпись не поместиться на заборе");
            }

        } catch (NumberFormatException ex) {
            System.out.println("Вы ввели не верное значение, введите положительные цифры");
        }
    }
}
