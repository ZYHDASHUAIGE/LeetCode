package LeetCode001_100;

import java.util.HashSet;

public class LeetCode036_Sudoku {
	public static void main(String[] args) {
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		boolean res = isValidSudoku1(board);
		System.out.println(res);
		boolean result = isValidSudoku2(board);
		System.out.println(result);
		test(board);
	}

	public static boolean isValidSudoku1(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			HashSet<Character> rows = new HashSet<Character>();
			HashSet<Character> columns = new HashSet<Character>();
			HashSet<Character> cubes = new HashSet<Character>();
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] != '.' && !rows.add(board[i][j]))
					return false;
				if (board[j][i] != '.' && !columns.add(board[j][i]))
					return false;

				int roeIndex = 3 * (i / 3);
				int colIndex = 3 * (1 % 3);

				if (board[roeIndex + j / 3][colIndex + j % 3] != '.'
						&& !cubes.add(board[roeIndex + j / 3][colIndex + j % 3]))
					return false;
			}

		}
		return true;
	}

	public static boolean isValidSudoku2(char[][] board) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '.')
					continue;
				// 判行
				for (int k = 8; k > j; k--) {
					if (board[i][j] == board[i][k])
						return false;
				}
				// 判列
				for (int k = 8; k > i; k--) {
					if (board[i][j] == board[k][j])
						return false;
				}
				// 判3*3，
				for (int k = i + 1; k % 3 != 0; k++) {
					for (int h = j / 3 * 3; h < j / 3 * 3 + 3; h++)
						if (board[i][j] == board[k][h])
							return false;
				}
			}
		}
		return true;
	}

	public static void test(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				for (int k = i + 1; k % 3 != 0; k++) {
					for (int h = j / 3 * 3; h < j / 3 * 3 + 3; h++) {
						System.out.println(board[k][h]);
					}
				}
			}
		}
	}

}
