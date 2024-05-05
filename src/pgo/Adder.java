package pgo;

import java.math.BigDecimal;
import java.util.List;

public class Adder {
    public static Integer add(int first, int second) {
        return first + second;
    }

    public static BigDecimal add(List<BigDecimal> bigDecimalList) {
        BigDecimal test = BigDecimal.valueOf(0);
        bigDecimalList.forEach(test::add);
        return test;
    }
}
