package baekjoon5;

import java.util.Scanner;
//
public class arr2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int sum = (A*B*C);
        String str = Integer.toString(sum);



        for(int i=0;i<10;i++){ //0~9까지 찾으면서 for문
            int count =0; //숫자 하나가 끝나면 count 초기화
            for(int j=0;j< str.length();j++){ //문자열의 길이만큼 for
                if((str.charAt(j) - '0') == i) { //문자열의0~j번째 글자 i랑 같으면 카운트
                                                 //- '0'은 아스키 코드...?
                    count++;
                }
            }
            System.out.println(count); // 문자 자리수 만큼 for문 돌면서 출력
        }
    }
}
/*
Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int sum = A * B * C;
		int[] arr = new int[10];

		while (sum > 0) {
			arr[sum % 10]++;
			sum /= 10;
		}

		for (int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}
}
 */
