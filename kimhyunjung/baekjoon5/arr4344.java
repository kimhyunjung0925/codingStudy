package baekjoon5;

import java.util.Scanner;

public class arr4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt(); // 테스트 케이스 수 입력
        double avg;
        double result; //소수점자리까지 출력

        for (int i = 0; i < C; i++) { // C = 입력한 테스트 케이스 수 만큼 for문 돔
            int sum = 0; // for문 안에 있어야 한줄 돌고 0으로 초기화
            int count = 0; // for문 안에 있어야 한줄 돌고 0으로 초기화

            int N = sc.nextInt(); // 학생 수
            int arr[] = new int[N];
            for (int j = 0; j < N; j++) { // 학생 수 만큼 for문 돔
                arr[j]  = sc.nextInt(); // 학생 수 만큼 점수 입력해 배열에 저장
                sum += arr[j]; // 점수 총 합계
            }
            avg = sum / N; //총 점수 나누기 학생 수
            for(int z =0; z<arr.length; z++){ // 배열의 길이(개수)만큼 for문 돔
                if (avg < arr[z]) { //평균보다 높은 점수이면 count에 1추가
                    count += 1;
                }
            }
            result = (double) count / N * 100; // (평균보다 높은점수의 학생 /총 학생 수 * 백분율)
            System.out.printf("%.3f", result); // 소수점 셋째자리까지 출력
            System.out.println("%");
        }
    }
}
