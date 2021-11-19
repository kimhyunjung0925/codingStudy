package listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcase = scan.nextInt();
        scan.nextLine();
        ArrayList<String[]> test = new ArrayList<>();
        int[] sumList = new int[testcase];

        for (int i=0; i<testcase; i++) {
            String ox = scan.nextLine();
            String[] oxList = ox.split("");
            test.add(oxList);

            int sum = 0;
            int plus = 0;
            for (int z=0; z<test.get(i).length; z++) {
                if (oxList[z].equals("O")) {
                    plus = plus + 1;
                    sum = sum + plus;
                } else {
                    plus = 0;
                }
            }
            sumList[i] = sum;
        }
        for (int i=0; i<testcase; i++) {
            System.out.println(sumList[i]);
        }
    }
}
