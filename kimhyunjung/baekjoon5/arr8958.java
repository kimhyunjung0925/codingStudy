package baekjoon5;

import java.util.Scanner;

//nextInt 정수하나를 한개로 침
//next 문자열하나를 한개로 침

public class arr8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[sc.nextInt()]; //arr[스캐너로 배열길이를 넣음]

        for (int i = 0; i < arr.length; i++) { //입력한 배열길이만큼 for
            int sum = 0; //총합계
            int cnt = 0; //연속합계
            arr[i] = sc.next(); //arr[i]에 들어있는 문자한줄
            for (int j = 0; j < arr[i].length(); j++) { //문자한줄의 문자길이만큼 for
                if (arr[i].charAt(j) == 'O') { //charAt=(j번째)문자하나를 비교
                    cnt++; //arr[i].j번째의 문자가 O이면 cnt++
                } else {
                    cnt = 0; //arr[i]의 문자가 O이 아니면 cnt=0
                }
                sum += cnt; //arr[i].length만큼 반복하며 cnt를 sum에 추가
            }
            System.out.println(sum); //총 sum출력
        }
    }
}
