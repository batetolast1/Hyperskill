import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int max = input;
        while (input != 0) {
            input = scanner.nextInt();
            if (input > max) {
                max = input;
            }
        }
        System.out.println(max);
    }
}