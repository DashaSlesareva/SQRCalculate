package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {
    @org.junit.jupiter.api.Test
    void squareCalculatorForNormalNumbers() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int beginning = 200;
        int ending = 300;
        int expected = 3;

        // вызываем целевой метод:
        int actual = service.calculate(beginning, ending);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void squareCalculatorForBigNumbers() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int beginning = 2000;
        int ending = 3000;
        int expected = 10;

        // вызываем целевой метод:
        int actual = service.calculate(beginning, ending);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void squareCalculatorForLittleNumbers() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int beginning = 20;
        int ending = 30;
        int expected = 0;

        // вызываем целевой метод:
        int actual = service.calculate(beginning, ending);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}