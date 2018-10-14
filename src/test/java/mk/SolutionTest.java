package mk;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void checkArray1() {
        int[] a = {1};
        int result = solution.solution(a);
        assertTrue(1==result);
    }

    @Test
    void checkArray2() {
        int[] a = {2};
        int result = solution.solution(a);
        assertTrue(0==result);
    }

    @Test
    void checkArray3() {
        int[] a = {2, 3};
        int result = solution.solution(a);
        assertTrue(0==result);
    }

    @Test
    void checkArray4() {
        int[] a = {1, 2};
        int result = solution.solution(a);
        assertTrue(1==result);
    }

    @Test
    void checkArray5() {
        int[] a = {1, 2, 3, 4};
        int result = solution.solution(a);
        assertTrue(1==result);
    }

    @Test
    void checkArray6() {
        int[] a = {1, 2, 2, 4};
        int result = solution.solution(a);
        assertTrue(0==result);
    }
}