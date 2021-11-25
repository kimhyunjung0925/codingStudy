package study1;

import java.util.Scanner;

public class Step5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            arr = new int[a];
            double sum = 0;

            for(int j=0; j<a; j++){
                int val = sc.nextInt();
                arr[j] = val;
                sum += val;
            }
            double mean = (sum/a);
            double cnt = 0;

            for(int j=0; j<a; j++){
                if(arr[j]>mean){
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n",(cnt/a)*100);
        }
        sc.close();
    }
}
