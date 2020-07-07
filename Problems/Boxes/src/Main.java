import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        final Scanner scanner = new Scanner(System.in);
        final int[] arr1 = new int[3];
        final int[] arr2 = new int[3];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Box 1 = Box 2");
        } else if (arr1[0] >= arr2[0] && arr1[1] >= arr2[1] && arr1[2] >= arr2[2]) {
            System.out.println("Box 1 > Box 2");
        } else if (arr2[0] >= arr1[0] && arr2[1] >= arr1[1] && arr2[2] >= arr1[2]) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incomparable");
        }
    }
}