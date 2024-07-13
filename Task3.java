import java.util.Arrays;
import java.util.Comparator;

public class Task3 {
    public static void main(String[] args) {
        Integer[] myArray={1,4,14,64,12,87,99};
        Arrays.sort(myArray, Comparator.reverseOrder());
        System.out.println(myArray[1]);
    }
}
