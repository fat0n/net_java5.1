package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test

    public void test() {
        SQRService calculate = new SQRService();
        int expected = 3;
        int min = 200;
        int max = 300;
        int actual = calculate.calcInTheRange(min, max);
        Assertions.assertEquals(expected, actual);

    }
}
