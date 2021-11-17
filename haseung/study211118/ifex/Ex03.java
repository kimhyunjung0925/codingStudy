package ifex;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();

        if (m >= 45) {
            m = m-45;
            System.out.printf("%d %d", h, m);
        } else {
            m = m+60-45;
            h = h-1;
            if (h < 0) {
                h = 23;
            }
            System.out.printf("%d %d", h, m);
        }
    }
}
