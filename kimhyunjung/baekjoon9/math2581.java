package baekjoon9;

import java.util.Scanner;

public class math2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        int min = N;

        x : for (int i = M; i <= N; i++) {
            if (i == 1) {
                continue; //1은 소수가 아니기 때문에 넘어감
            }
            for (int j = 2; j < i; j++) { // i를 2부터 i-1까지의 숫자만큼 반복for
                if (i % j == 0) { // 2~i-1까지의 숫자로 i를 나누었을 때 나머지가 0이면 소수가 아님
                    continue x; // 소수가 아닌것들은 넘어가고 다시 for i문으로 감
                }
            }
            sum += i; // 위에서 걸러져 나온 소수인 i를 sum에 더함
            if (min > i) { // i와 최대값을 비교하며 계속 갱신해 최소값 구함
                min = i;
            }
        }
        if(sum == 0) {
            System.out.println(-1); //만약 소수의 합계가 0이면 -1을 리턴
            return;
        }
        System.out.println(sum + "\n" + min); // 소수의 합계가 0이 아닌경우 합계와, 최소값을 리턴
    }
}
