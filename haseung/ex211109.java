package baekjoon;

import java.util.Scanner;

public class ex211109 {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
        */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a);
        System.out.println(b);

        //b를 자릿수마다 분해
        int b1 = b/100;
        int b2 = (b%(b1*100))/10;
        int b3 = b%((b1*100)+(b2*10));
        //출력
        System.out.println(a*b3);
        System.out.println(a*b2);
        System.out.println(a*b1);
        System.out.println((a*b3)+((a*b2)*10)+((a*b1)*100));
    }
}
