package ru.job4j.array;

import org.junit.jupiter.api.Test;
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

    @Test
    public void whenDiapasonHas8ThenResultEqualFinish() {
        int[] data = new int[] {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int el = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = new int[] {5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int el = 4;
        int start = 1;
        int finish = 8;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasNot17ThenMinus1() {
        int[] data = new int[] {35, 12, 25, 40, 193, 16};
        int el = 17;
        int start = 1;
        int finish = 3;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas70Then1() {
        int[] data = new int[] {172, 70, 293, 45, 80, 1};
        int el = 70;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}
