package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap65to142() {
        int[] input = {45, 65, 3, 23, 142};
        int source = 1;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {45, 142, 3, 23, 65};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap3to18() {
        int[] input = {35, 1, 18, 3, 4, 73};
        int source = 2;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {35, 1, 3, 18, 4, 73};
        assertThat(result).containsExactly(expected);
    }
}
