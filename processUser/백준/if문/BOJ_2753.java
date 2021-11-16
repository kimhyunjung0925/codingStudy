package if문;

import java.util.Scanner;

/*
윤년
https://www.acmicpc.net/problem/2753
 */
public class BOJ_2753 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();

        if(num1%4 == 0 && num1%100 !=0 || num1%400 == 0){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
