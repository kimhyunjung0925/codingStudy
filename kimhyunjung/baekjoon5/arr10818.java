package baekjoon5;

import java.util.Scanner;
//???
public class arr10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int max = -1000000; //최대값
        int min = 1000000; //최소값

        for (int i=0; i < N; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>max) { //max의 값보다 array[i]이 크면 max = array[i]
                max = arr[i];
            }
            if (arr[i]<min) {//min의 값보다 array[i]이 작으면 min = array[i]
                min = arr[i];
            }
        }
        System.out.println( min + " " + max );
    }
}
