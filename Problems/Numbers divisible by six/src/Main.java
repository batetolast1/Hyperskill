import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            if (temp % 6 == 0) {
                sum += temp;
            }
        }
        System.out.println(sum);
    }
}