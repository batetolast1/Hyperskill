import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        int sum = n / 100 + (n / 10) % 10 + (n % 100) % 10;
        System.out.println(sum);
    }
}