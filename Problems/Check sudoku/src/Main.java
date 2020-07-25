import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int n2 = n * n;
        int[][] sudoku = new int[n2][n2];

        for (int row = 0; row < n2; row++) {
            for (int col = 0; col < n2; col++) {
                int next = scanner.nextInt();
                if (next < 0 || next > n2) {
                    System.out.println("NO");
                    return;
                } else {
                    sudoku[row][col] = next;
                }
            }
        }

        int[][] tempSumSquare = new int[n][n2];
        for (int row = 0; row < n2; row++) {
            int[] tempSumRow = new int[n2];
            int[] tempSumCol = new int[n2];
            for (int col = 0; col < n2; col++) {
                int rowCell = sudoku[row][col];
                int colCell = sudoku[col][row];
                if (tempSumRow[rowCell - 1] == 0) {
                    tempSumRow[rowCell - 1] = 1;
                } else {
                    System.out.println("NO");
                    return;
                }
                if (tempSumCol[colCell - 1] == 0) {
                    tempSumCol[colCell - 1] = 1;
                } else {
                    System.out.println("NO");
                    return;
                }

                if (tempSumSquare[col / n][rowCell - 1] == 0) {
                    tempSumSquare[col / n][rowCell - 1] = 1;
                } else {
                    System.out.println("NO");
                    return;
                }
            }

            if ((row + 1) % n == 0) {
                for (int i = 0; i < n; i++) {
                    tempSumSquare[i] = new int[n2];
                }
            }
        }

        System.out.println("YES");
    }
}
