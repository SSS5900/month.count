package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MonCoServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/MonCo.csv")

    public void testI10E3T20(int income, int expense, int threshold, int expected) {
        MonCoService service = new MonCoService();

//        int income = 10_000;
//        int expense = 3_000;
//        int threshold = 20_000;
//        int expected = 3;

        int actual = (int) service.calcMonth(income, expense, threshold);
        Assertions.assertEquals(expected, actual);

    }

    //    @Test
//    public void testI100E60T150() {
    MonCoService service = new MonCoService();

//        int income = 100_000;
//        int expense = 60_000;
//        int threshold = 150_000;
//        int expected = 2;

//        int actual = (int) service.calcMonth(income, expense, threshold);
//        Assertions.assertEquals(expected, actual);
//    }


}
