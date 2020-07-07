import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int biggest4 = 0;
        int elements = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < elements; i++) {
            int temp = Integer.parseInt(scanner.nextLine());
            if (temp % 4 == 0 && temp > biggest4) {
                biggest4 = temp;
            }
        }
        System.out.println(biggest4);
    }
}