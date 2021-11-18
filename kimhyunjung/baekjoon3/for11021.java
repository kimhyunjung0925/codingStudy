package baekjoon3;

import java.util.Scanner;
//처음에 틀림 A+B에 괄호 안침,,
public class for11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println("Case #" + i + ": " + (A+B));
        }
    }
}
