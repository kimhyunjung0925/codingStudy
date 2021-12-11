package baekjoon8;

import java.util.Scanner;

public class math2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sw = 0;

        int a = input/5; // a = input을 5으로 나눈 값
        int b = input/3; // b = input을 3으로 나눈 값

        for(int i=a; i>=0; i--) { // 5로 나눈 값을 0일 때 까지 --반복
            for (int j = 0; j <= b; j++) { // 3으로 나눈 값 까지 ++반복
                if (i * 5 + j * 3 == input) {
                    System.out.println(i + j);
                    sw = 1;
                    break;
                }
            }
            if (sw == 1) { // for문 도는 동안 가장 먼저 딱 맞아 떨어지면 sw=1이 되면서 중지
                break;
            }
        }
        if(sw!=1){ // for문을 다 돌고도 답이 없으면 -1출력
                    System.out.println(-1);
        }
    }

}


