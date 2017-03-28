package net.twonky.demo;

import static java.lang.String.format;
import static java.lang.System.out;

import java.util.stream.Stream;

public class ConvertNumberToBinary {
    public static String binary(long number) {
        if (number == 0 || number == 1) {
            return Long.toString(number);
        }
        return binary(number >> 1) + Long.toString(number % 2);
    }

    public static void main(String[] args) {
        Stream.of(0L, 45L, 2L, 255L, 1L).sorted().map(n -> format("%d\t%s", n, binary(n)))
                .forEach(out::println);
    }
}
