package forex;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for (int i=0; i<num; i++) {
            for (int z=0; z<=i; z++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
