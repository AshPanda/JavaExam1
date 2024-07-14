package Task2;

import java.util.Random;

public class HumiditySensor {
    private static final Random randomHumidity = new Random();

    public int getHumidity() {
        return randomHumidity.nextInt(100) + 1;
    }
}
