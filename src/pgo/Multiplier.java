package pgo;

import java.math.BigDecimal;
import java.util.List;

public class Multiplier {

    public static int multiply(int first, int sec) {
        return first * sec;
    }

    public static int multiply(int first, int sec, int third, int fourth) {
        return multiply(multiply(first, sec), multiply(third, fourth));
    }

    public static double multiply(double first, double sec) {
        return first * sec;
    }

    public static BigDecimal multiply(BigDecimal first, BigDecimal sec) {
        return first.multiply(sec);
    }

    public static int multiply(List<Integer> integerList) {
        var result = 1;
        for (Integer num : integerList) {
            result *= num;
        }
        return result;
    }
}
