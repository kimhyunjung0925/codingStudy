package forex;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i=1; i<10; i++) {
            System.out.printf("%d * %d = %d", n, i, n*i);
            System.out.println();
        }
    }
}
