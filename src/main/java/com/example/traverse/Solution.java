package com.example.traverse;

/**
 * @author Elif Dal
 */
public class Solution {

    /**
     * this array is used for the calculation of the direction for every move
     */
    public final int DIRECTIONS[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    /**
     * returns true for the given indexes if the direction is needed to be turned
     *
     * @param row    row index of the current matrix item
     * @param col    column index of the current matrix item
     * @param height height of the matrix
     * @param width  width of the matrix
     * @return true if there is need to change the direction, false vice versa
     */
    public boolean shouldTurn(int row, int col, int height, int width) {
        int move = 1;
        if (row > height - 1 - row) {
            row = height - 1 - row;
            move = 0;
        }
        if (col >= width - 1 - col) {
            col = width - 1 - col;
            move = 0;
        }
        row = row - move;
        if (row == col)
            return true;
        return false;
    }

    /**
     * starts the traverse operation with iterating through the direction
     * and prints the traversed matrix
     *
     * @param arr    provided 2-D matrix
     * @param height height of the provided matrix
     * @param width  width of the provided matrix
     */
    public String traverse(int arr[][], int height, int width) {
        int directionIdx = 0;
        int curRow = 0;
        int curCol = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < height * width; i++) {
            sb.append(arr[curRow][curCol] + " ");
            if (shouldTurn(curRow, curCol, height, width)) {
                directionIdx = (directionIdx + 1) % 4;
            }
            curRow += DIRECTIONS[directionIdx][0];
            curCol += DIRECTIONS[directionIdx][1];
        }
        return sb.toString();
    }

}
