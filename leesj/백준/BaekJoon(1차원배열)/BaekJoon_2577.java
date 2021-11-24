//https://www.acmicpc.net/problem/2577
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            int num3 = scan.nextInt();

            int number = num1*num2*num3;
            String st_Num = String.valueOf(number);

               int []arr = new int[10];
            for(int i=0; i<st_Num.length(); i++){
                int index =Integer.parseInt(st_Num.substring(i, i+1));
                ++arr[index];
            }
            for(int j=0; j<arr.length; j++){
                System.out.println(arr[j]);
            }
        }
}
