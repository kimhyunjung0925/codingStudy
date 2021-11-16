package for문;
import java.util.Scanner;
/*
구구단
https://www.acmicpc.net/problem/2739
 */
public class BOJ_2739 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();

        for(int i = 1; i <10;i++){
            System.out.printf("%d * %d = %d\n", num1, i, num1*i);
        }
    }
}
