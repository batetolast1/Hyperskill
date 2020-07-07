import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        for (int i = 0; i < n; i++) {
            int toCheck = scanner.nextInt();
            if (toCheck == -1) {
                smaller++;
            } else if (toCheck == 1) {
                larger++;
            } else if (toCheck == 0) {
                perfect++;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}