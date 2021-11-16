package if문;

import java.util.Scanner;

/*
알람시계
https://www.acmicpc.net/problem/2884
 */
public class BOJ_2884 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int mm1 = 60;
        final int mm2 = 45;
        int h = scan.nextInt();
        int m = scan.nextInt();
        int m2 = 0;

        if(m<mm2){
            h -= 1;
            if(h < 0){
                h =23;
            }
            m2 = (mm1+m)-mm2;
            System.out.printf("%d %d",h, m2);
        } else {
            m2 = m-mm2;
            System.out.printf("%d %d",h, m2);
        }
    }
}
