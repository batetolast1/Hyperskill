import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = n;
        while (n != 0) {
            n = scanner.nextInt();
            sum += n;
        }
        System.out.println(sum);
    }
}