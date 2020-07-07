import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(chooseShape(n));
    }

    public static String chooseShape(int n) {
        switch (n) {
            case 1:
                return "You have chosen a square";
            case 2:
                return "You have chosen a circle";
            case 3:
                return "You have chosen a triangle";
            case 4:
                return "You have chosen a rhombus";
            default:
                return "There is no such shape!";
        }
    }
}