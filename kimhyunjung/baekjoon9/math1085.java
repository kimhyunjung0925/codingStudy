package baekjoon9;

import java.util.Scanner;

public class math1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //현재 위치하는 지점
        int x = sc.nextInt(); //가로값
        int y = sc.nextInt(); //세로값

        //제일 오른쪽 위 꼭지점
        int w = sc.nextInt(); //가로값
        int h = sc.nextInt(); //세로값

        int b = w-x; //오른쪽위 가로값 - 현재위치 가로값
        int d = h-y; //오른쪽위 세로값 - 현재위치 세로값

        int min = x; // 우선 제일 최소값으로 현재위치 가로값으로 설정
        if(min>y) { // 가로값보다 현재위치 세로값이 작으면
            min= y; // 최소값은 세로값으로 변경
        }if (min>b) { // 가로값끼리 뺀 값이 현재 최소값보다 작으면
            min = b; // 최소값은 가로값 뺀것으로 변경
        }if (min>d) { //세로값끼리 뺀 값이 현재 최소값보다 작으면
            min = d; // 최소값은 세로값 뺀것으로 변경
        }

        System.out.println(min); //최종 최소값 출력
    }
}
