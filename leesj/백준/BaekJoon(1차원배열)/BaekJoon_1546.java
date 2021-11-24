//https://www.acmicpc.net/problem/1546
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr= new int[scan.nextInt()];

        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        int temp;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]>arr[i]){
                temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
            }
        }
            int max = arr[arr.length-1];


        double sum = 0;
            for(int i=0; i<arr.length; i++){

                sum+=(double)arr[i]/max*100;
            }

        fmt(sum/arr.length);

    }

    public static void fmt(double d)
    {
       if(d == (long) d){
           System.out.printf("%.1f",d);
       }else{
           String str = String.valueOf(d);
           System.out.println(str);
       }
    }
}



