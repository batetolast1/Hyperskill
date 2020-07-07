import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt() > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}