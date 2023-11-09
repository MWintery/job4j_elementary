package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {
    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom25To39Then224() {
        int start = 25;
        int finish = 39;
        int result = Counter.sumByEven(start, finish);
        int expected = 224;
        assertThat(result).isEqualTo(expected);
    }
}
