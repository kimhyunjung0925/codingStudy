package baekjoon5;

import java.util.Scanner;

public class arr1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 과목의 개수
        int arr[] = new int[N];
        int max = 0;
        int sum = 0;

        for(int i = 0; i<N; i++) { //과목의 개수 N만큼 for
            arr[i] = sc.nextInt(); //N만큼 과목 점수 입력
            if(arr[i]>max) { // 최대값 구하기
                max = arr[i];
            }
            sum += arr[i]; //모든과목의 총 합 구하기
        }
        double avg = (double)sum/N/max *100; // 총 점수 합 / 과목개수 / 최대값 * 100
        System.out.println(avg);
    }
}
/*
-최대값 구하기
-for(int i=0;i<N;i++){ //과목의 개수(N)만큼 for
 arr[i] / 최대값 * 100
}
 */