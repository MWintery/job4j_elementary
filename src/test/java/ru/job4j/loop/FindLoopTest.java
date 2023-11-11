package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import ru.job4j.array.FindLoop;

import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot18ThenMinus1() {
        int[] data = new int[] {13, 8, 40, 2};
        int el = 18;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas37Then4() {
        int[] data = new int[] {229, 87, 9, 16, 37};
        int el = 37;
        int result = FindLoop.indexOf(data, el);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}
