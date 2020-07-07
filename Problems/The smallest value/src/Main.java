import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long factorial = 1;
        int n = 1;
        while (factorial <= m) {
            n++;
            factorial *= n;
        }
        System.out.println(n);
    }
}