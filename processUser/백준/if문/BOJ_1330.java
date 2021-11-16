package if문;

import java.util.Scanner;
/*
두 수 비교하기
https://www.acmicpc.net/problem/1330
 */
public class BOJ_1330 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if(num1 > num2) {
            System.out.println(">");
        } else if(num1 < num2) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }

}
