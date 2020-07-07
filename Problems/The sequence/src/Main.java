import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int div4 = 0;
        while (n != 0) {
            int temp = scanner.nextInt();
            n--;
            if (temp % 4 == 0 && temp > div4) {
                div4 = temp;
            }
        }
        System.out.println(div4);
    }
}