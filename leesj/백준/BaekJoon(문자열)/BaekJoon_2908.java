//https://www.acmicpc.net/problem/2908
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[2];
        char temp;
        for(int i=0; i<2; i++){
            arr[i] = scan.nextInt();
            String str =String.valueOf(arr[i]);
            char[] chas = str.toCharArray();
            temp =chas[0];
            chas[0] = chas[chas.length-1];
            chas[chas.length-1] = temp;
            str = String.valueOf(chas);
            arr[i] = Integer.parseInt(str);
        }

        if(arr[0]>arr[1]){
            System.out.println(arr[0]);
        }else
        {
            System.out.println(arr[1]);
        }



    }
}


