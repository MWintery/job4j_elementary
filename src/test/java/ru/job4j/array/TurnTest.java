package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TurnTest {
    @Test
    void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {5, 1, 8, 4, 3};
        int[] result = Turn.back(input);
        int[] expected = new int[] {3, 4, 8, 1, 5};
        assertThat(result).containsExactly(expected);
    }
}
