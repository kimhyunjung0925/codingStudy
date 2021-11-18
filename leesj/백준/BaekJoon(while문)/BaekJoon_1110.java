//https://www.acmicpc.net/problem/1110
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            int[] arr = new int[4];
            int count =1;
            int newNum =num;
            while (true){
                arr[0] = newNum/10; //십의 자리수
                arr[1] = newNum%10; //일의 자리수
                arr[2]= (arr[0]+arr[1])%10; //새로운 수의 일의 자리수
                arr[3] = arr[1]*10+arr[2]; // 새로운수
                if(arr[3]==num){
                    break;
                }
                newNum=arr[3];
                count++;
            }
            System.out.println(count);
        }
}
