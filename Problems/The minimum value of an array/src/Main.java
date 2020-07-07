import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int[] intArr = new int[n];
        for (int i = 0; i < n; i++) {
            intArr[i] = scanner.nextInt();
        }
        Arrays.sort(intArr);
        System.out.println(intArr[0]);
    }
}