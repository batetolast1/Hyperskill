import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        boolean isOrderedAsc = true;
        boolean isOrderedDesc = true;
        int n = scanner.nextInt();
        int n1 = scanner.nextInt();
        while (n1 != 0) {
            if (isOrderedAsc && n > n1) {
                isOrderedAsc = false;
            }
            if (isOrderedDesc && n < n1) {
                isOrderedDesc = false;
            }
            n = n1;
            n1 = scanner.nextInt();
        }
        System.out.println(isOrderedAsc || isOrderedDesc);
    }
}