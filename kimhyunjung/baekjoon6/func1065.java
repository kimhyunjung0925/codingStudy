package baekjoon6;


import java.util.Scanner;

public class func1065 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count;

        if (N < 100) {
            count = N; //100미만은 전부다 한수
        } else {
            count = 99; //100이상부터는 100미만 99개 + count
            for (int j = 100; j <= N; j++) { //100~N까지 for
                int a = j / 100; //백의자리 숫자 한개
                int b = (j % 100) / 10; //십의자리 숫자 한개
                int c = j % 10; // 일의자리 숫자 한개
                if (a - b == b - c) { // 백의자리 - 십의자리가 == 십의자리 - 일의자리랑 같을때
                    count++; //1씩 카운트
                }
            }
        }
        System.out.println(count); //총 카운트 출력
    }
}








/*  1111 공차0, 1234 공차1
-입력110
1~99까지는 한수
100부터는 공차가 다르기때문에 한수가 아님

-입력1
1은 한수

-입력210
1~99까지는 한수
100부터는 공차가 다르기때문에 한수가 아님
111, 123 135 147 159
210
 */