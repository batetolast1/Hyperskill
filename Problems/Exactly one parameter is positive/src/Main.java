import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numOfPositives = 0;
        for (int i = 0; i < 3; i++) {
            if (scanner.nextInt() > 0) {
                numOfPositives++;
            }
        }
        System.out.println(numOfPositives == 1);
    }
}