package baekjoon1;

import java.util.Scanner;
//틀림 2번째 4번째 괄호 덜침,,
public class one10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B,C;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        System.out.println((A+B)%C);
        System.out.println(((A%C)+(B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);
    }
}

