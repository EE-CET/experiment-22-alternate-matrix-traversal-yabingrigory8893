import java.util.Scanner;

public class AlternateTraversal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (!scanner.hasNextInt()) return;
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int[][] matrix = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (scanner.hasNextInt()) {
                        matrix[i][j] = scanner.nextInt();
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < m; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < n; j++) {
                        sb.append(matrix[i][j]).append(" ");
                    }
                } else {
                    for (int j = n - 1; j >= 0; j--) {
                        sb.append(matrix[i][j]).append(" ");
                    }
                }
            }

            System.out.println(sb.toString().trim());
        }
    }
}
