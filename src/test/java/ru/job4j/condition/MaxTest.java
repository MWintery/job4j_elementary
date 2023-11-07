package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax43To87Then87() {
        int left = 43;
        int right = 87;
        int result = Max.max(left, right);
        int expected = 87;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax51To4Then51() {
        int left = 51;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 51;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To10Then10() {
        int left = 10;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}
