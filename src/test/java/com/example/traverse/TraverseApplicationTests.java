package com.example.traverse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TraverseApplicationTests {

    private final int MATRIX_4x4[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
    private final String TRAVERSED_MATRIX_4x4_RESULT = "1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 ";

    private final int MATRIX_3x4[][] = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}, {13, 14, 15}};
    private final String TRAVERSED_MATRIX_3x4_RESULT = "1 2 3 7 11 15 14 13 9 5 6 10 ";

    Solution solution = new Solution();

    @Test
    public void whenTheGivenMatrixIsEmpty_shouldTurn_returnsTrue() {
        boolean result = solution.shouldTurn(0, 0, 0, 0);
        Assertions.assertTrue(result);
    }

    @Test
    public void when4x4MatrixIsGivenAndNeededToTurnDown_shouldTurn_returnsTrue() {
        boolean result = solution.shouldTurn(0, 3, 4, 4);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource({"3, 0", "2, 1"})
    public void when4x4MatrixIsGivenAndNeededToTurnDown_shouldTurn_returnsTrue(int row, int col) {
        boolean result = solution.shouldTurn(row, col, 4, 4);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource({"3, 3", "2, 2"})
    public void when4x4MatrixIsGivenAndNeededToTurnLeft_shouldTurn_returnsTrue(int row, int col) {
        boolean result = solution.shouldTurn(row, col, 4, 4);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource({"0, 3"})
    public void when4x4MatrixIsGivenAndNeededToTurnUp_shouldTurn_returnsTrue(int row, int col) {
        boolean result = solution.shouldTurn(row, col, 4, 4);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource({"1, 0", "1,2"})
    public void when4x4MatrixIsGivenAndNeededToTurnRight_shouldTurn_returnsTrue(int row, int col) {
        boolean result = solution.shouldTurn(row, col, 4, 4);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource({"0, 0", "0, 1", "0, 2", "1, 1", "1, 1", "2, 0", "2,3", "3,1", "3,2"})
    public void when4x4MatrixIsGivenAndNoNeedToTurn_shouldTurn_returnsFalse(int row, int col) {
        boolean result = solution.shouldTurn(row, col, 4, 4);
        Assertions.assertFalse(result);
    }

    @Test
    public void when4x4MatrixIsGiven_traverse_printsAsExpected() {
        String result = solution.traverse(MATRIX_4x4, 4, 4);
        Assertions.assertEquals(TRAVERSED_MATRIX_4x4_RESULT, result);
    }

    @Test
    public void when3x4MatrixIsGiven_traverse_printsAsExpected() {
        String result = solution.traverse(MATRIX_3x4, 4, 3);
        Assertions.assertEquals(TRAVERSED_MATRIX_3x4_RESULT, result);
    }
}
