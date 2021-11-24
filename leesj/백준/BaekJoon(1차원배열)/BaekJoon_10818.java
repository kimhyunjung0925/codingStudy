//https://www.acmicpc.net/problem/10818
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int []arr = new int[scan.nextInt()];

        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        int temp;

        for(int  i=1; i<arr.length; i++){
            if(arr[i-1] > arr[i]){
                temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
            }
        }

        int max = arr[arr.length-1];

        for(int  i=arr.length-2; i>=1; i--){
            if(arr[i-1] > arr[i]){
                temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
            }
        }

        int min = arr[0];

        System.out.printf(min+" "+max);
    }
}
