// Solution for the problem, Valid Sudoku in the leetcode.
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> seen = new HashSet<>();

        // [Rule No.1] Checking Row Line
        for (char[] row : board) {
            for (char c : row) {
                if (c != '.') {
                    if(seen.contains(c)) {
                        return false;
                    }
                    else {
                        seen.add(c);
                    }
                }
            }
            seen.clear();
        }

        // [Rule No.2] Checking Col Line
        for (int col = 0; col < 9; col++) {
            for (int row = 0; row < 9; row++) {
                char c = board[row][col];

                if (c != '.') {
                    if (seen.contains(c)) {
                        return false;
                    }
                    else {
                        seen.add(c);
                    }
                }
            }
            seen.clear();
        }

        // [Rule No.3] Checking 3x3 sub-boxes.
        for (int startRow = 0; startRow < 9; startRow += 3) {
            for (int startCol = 0; startCol < 9; startCol += 3) {
                for (int i = startRow; i < startRow + 3; i++) {
                    for (int j = startCol; j < startCol + 3; j++) {
                        char c = board[i][j];

                        if (c != '.') {
                            if (seen.contains(c)) {
                                return false;
                            }
                            else {
                                seen.add(c);
                            }
                        }
                    }
                }

                seen.clear();
            }
        }

        return true;
    }
}
