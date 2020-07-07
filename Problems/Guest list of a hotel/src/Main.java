//put imports you need here

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            String[] line = scanner.nextLine().split(" ");
            strList.addAll(Arrays.asList(line));
        }
        for (int i = strList.size() - 1; i >= 0; i--) {
            System.out.println(strList.get(i));
        }
    }
}