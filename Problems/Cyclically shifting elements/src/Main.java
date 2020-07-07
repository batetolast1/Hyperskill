import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // put your code here
        final int n = scanner.nextInt();
        final int[] a = new int[n];
        for (int i = 1; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        a[0] = scanner.nextInt();
        for (int i : a) {
            System.out.printf("%d ", i);
        }
    }
}