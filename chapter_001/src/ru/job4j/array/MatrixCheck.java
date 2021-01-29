package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index = 0; index != 5; index++) {
            if (board[index][index] == 'X') {
                if (monoHorizontal(board, index) || monoVertical(board, index)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean monoHorizontal(char[][] board, int index) {
        boolean result = true;
        for (int i = 0; i != 5; i++) {
            if (board[index][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int index) {
        boolean result = true;
        for (int i = 0; i != 5; i++) {
            if (board[i][index] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}