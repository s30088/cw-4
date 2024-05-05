package pgo;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("1: " + Multiplier.multiply(2, 2));
        System.out.println("2: " + Multiplier.multiply(2, 2, 2, 2));
        System.out.println("3: " + Multiplier.multiply(2.0, 2.0));
        System.out.println("4: " + Multiplier.multiply(BigDecimal.TWO, BigDecimal.TWO));
        System.out.println("5: " + Multiplier.multiply(List.of(2, 2, 2)));


        System.out.println("\n1: " + Adder.add(2, 2));
        System.out.println("2: " + Adder.add(List.of(BigDecimal.TWO, BigDecimal.TWO)));

        System.out.println("\n1: " + Address.createAddress("Poland", "Warsaw", "03-750", "Diamentowa", 7));
    }
}