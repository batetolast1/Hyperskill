import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        final Scanner scanner = new Scanner(System.in);
        final long n = scanner.nextLong();
        final char c = scanner.next().charAt(0);
        final long m = scanner.nextLong();
        switch (c) {
            case '+':
                System.out.println(n + m);
                break;
            case '-':
                System.out.println(n - m);
                break;
            case '*':
                System.out.println(n * m);
                break;
            case '/':
                if (m == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(n / m);
                }
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}