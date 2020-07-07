import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int n = scanner.nextInt();
        while (n != 0) {
            if (n % 2 == 0) {
                stringBuilder.append("even\n");
            } else {
                stringBuilder.append("odd\n");
            }
            n = scanner.nextInt();
        }
        System.out.println(stringBuilder.toString());
    }
}