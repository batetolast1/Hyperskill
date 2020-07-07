import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int c = scanner.nextInt();
            if (c % 2 == 0) {
                sum += c / 2;
            } else {
                sum += c / 2 + 1;
            }
        }

        System.out.println(sum);
    }
}