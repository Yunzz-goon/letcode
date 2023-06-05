import java.util.ArrayList;

public class q36 {
    public static void main(String[] args) {
        boolean result = true;

        char[][] board = new char[][]{{'.', '.', '4', '.', '.', '.', '6', '3', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.', '.'}, {'5', '.', '.', '.', '.', '.', '.', '9', '.'}, {'.', '.', '.', '5', '6', '.', '.', '.', '.'}, {'4', '.', '3', '.', '.', '.', '.', '.', '1'}, {'.', '.', '.', '7', '.', '.', '.', '.', '.'}, {'.', '.', '.', '5', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.', '.'}};
        // check row
        for (char[] row : board) {
            ArrayList<Character> row_ls = new ArrayList<Character>();
            for (char ch : row) {
                if (row_ls.contains(ch)) {
                    result = false;
                } else if (ch != '.') {
                    row_ls.add(ch);
                }
            }
        }

        // check column
        for (int i = 0; i < 9; i++) {
            ArrayList<Character> col_ls = new ArrayList<Character>();
            for (int j = 0; j < 9; j++) {
                if (col_ls.contains(board[j][i])) {
                    result = false;
                } else if (board[j][i] != '.') {
                    col_ls.add(board[j][i]);
                    if (board[j][i] == '5'){
                        System.out.println(board[j][i]);
                        System.out.println(col_ls);
                    }
                }
            }
        }

        for (int k = 0; k < 9; k++) {
            char[][] sub_board = obtainSubBoard(k, board);
            ArrayList<Character> block_ls = new ArrayList<Character>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (block_ls.contains(sub_board[i][j])) {
                        result = false;
                    } else if (sub_board[i][j] != '.') {
                        block_ls.add(sub_board[i][j]);
                    }
                }

            }

        }
        System.out.println(result);
    }

// get the subBoard
public static char[][] obtainSubBoard(int no, char[][] board) {
    char[][] subBoard = new char[3][3];
    switch (no) {
        // row 0
        case 0:
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    subBoard[i][j] = board[i][j];
                }
            }
            break;
        case 1:
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    subBoard[i][j] = board[i][j + 3];
                }
            }
            break;
        case 2:
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    subBoard[i][j] = board[i][j + 6];
                }
            }
            break;

        // row 1
        case 3:
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    subBoard[i][j] = board[i + 3][j];
                }
            }
            break;
        case 4:
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    subBoard[i][j] = board[i + 3][j + 3];
                }
            }
            break;
        case 5:
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    subBoard[i][j] = board[i + 3][j + 6];
                }
            }
            break;

        // row 2
        case 6:
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    subBoard[i][j] = board[i + 6][j];
                }
            }
            break;
        case 7:
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    subBoard[i][j] = board[i + 6][j + 3];
                }
            }
            break;
        case 8:
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    subBoard[i][j] = board[i + 6][j + 6];
                }
            }
            break;
    }
    return subBoard;
}

}
