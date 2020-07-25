import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] pat = new char[4][4];
        for (int i = 0; i < 4; i++) {
            pat[i] = scanner.nextLine().toCharArray();
        }
        String pretty = "YES";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (pat[i][j] == pat[i][j + 1] && pat[i][j] == pat[i + 1][j + 1] && pat[i][j] == pat[i + 1][j]) {
                    pretty = "NO";
                    break;
                }
            }
        }
        System.out.println(pretty);
    }
}