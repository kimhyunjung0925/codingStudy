package forex;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        int[][] numlist = new int[t][2];
        for (int i=0; i<t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            numlist[i][0] = a;
            numlist[i][1] = b;
        }
        for (int i=0; i<t; i++) {
            int sum = numlist[i][0]+numlist[i][1];
            System.out.printf("Case #%d: %d", i+1, sum);
            System.out.println();
        }
    }
}
