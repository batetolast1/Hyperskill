import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double p = scanner.nextDouble();
        double k = scanner.nextDouble();
        int year = 0;

        while (m < k) {
            m *= p / 100 + 1;
            year++;
        }
        System.out.println(year);
    }
}