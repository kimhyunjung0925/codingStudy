package baekjoon2;

import java.util.Scanner;
//어우
public class if2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H,M;
        H = sc.nextInt();
        M = sc.nextInt();

        if(M-45<0) {
            if (H-1 < 0) {
                H = 24-1;
                M = (M-45) + 60;
            } else {
                H--;
                M = (M-45) + 60;
            }
        } else {
            M = M-45;
        }
        System.out.println(H + " " + M);
    }
}
