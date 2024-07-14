import java.util.Arrays;

//Второй элемент
//Напишите программу, которая находит в массиве чисел второй по величине элемент.
//Например, для массива [1,5,7,3,2,0,4,9,6], программа выведет 7, потому что самый большой элемент - 9, а, после него, 7.

public class Task3 {
    public static void main(String[] args) {
        Integer[] myArray = {1, 4, 14, 64, 12, 87, 99};
        Arrays.sort(myArray);
        System.out.println(myArray[myArray.length - 2]);
    }
}
