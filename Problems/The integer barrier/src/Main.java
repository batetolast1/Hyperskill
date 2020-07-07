import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n;
            if (sum >= 1000) {
                sum -= 1000;
                break;
            }
            n = scanner.nextInt();
        }
        System.out.println(sum);
    }
}