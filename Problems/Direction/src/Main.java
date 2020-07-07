import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(showDirection(n));
    }

    public static String showDirection(int n) {
        switch (n) {
            case 1:
                return "move up";
            case 2:
                return "move down";
            case 3:
                return "move left";
            case 4:
                return "move right";
            case 0:
                return "do not move";
            default:
                return "error!";
        }
    }
}