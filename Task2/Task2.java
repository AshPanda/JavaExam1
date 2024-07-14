package Task2;//У программиста Васи на подоконнике растёт кактус. Вася постоянно забывает его поливать,
//поэтому он купил датчик влажности и решил составить программу для отслеживания времени полива.
//На вход программа ждет дату последнего полива кактуса. Если сейчас зима (декабрь - февраль),
//то кактус поливается раз в месяц. Если осень или весна - раз в неделю.
//Летом поливается в зависимости от влажности воздуха, но не чаще одного раза в два дня.
//Значение влажности воздуха в программу попадает автоматически от датчика
//(реализуйте через вызов метода класса Датчик, внутри которого будет генерация рандомного числа).
//Если влажность меньше 30%, кактус нужно полить.
//Вася ожидает от программы, что после проверки всех данных, она выведет ему сообщение с датой, когда надо поливать кактус.
//Реализуйте программу, используя принципы ООП и библиотеки для работы с датой.

import Task2.sessons.Season;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите последнего полива кактусу в формате гггг-мм-дд:");
        Scanner userInput = new Scanner(System.in);
        String date = userInput.nextLine();
        try {
            LocalDate input = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
            var humiditySensor = new HumiditySensor();
            int humidity = humiditySensor.getHumidity();
            System.out.printf("Влажность почвы = %d%n", humidity);
            var nextDate = input;
            if (humidity > 30) {

                nextDate = Season.getSeason(input).nextDate(input);

            }
            System.out.printf("Следующая дата поливки кактуса = %S%n", DateTimeFormatter.ISO_LOCAL_DATE.format(nextDate));

        } catch (DateTimeParseException ex) {
            System.out.println("Вы ввели не верное значение, введите дату в правильном формате");
        }

    }
}
