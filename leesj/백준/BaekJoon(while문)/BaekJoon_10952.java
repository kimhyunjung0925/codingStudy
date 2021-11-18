//https://www.acmicpc.net/problem/10952
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            List<Integer> list  = new ArrayList<>();
            while (true){
                int num1= scan.nextInt();
                int num2=scan.nextInt();
                if(num1==0&&num2==0){
                    break;
                }
                list.add(num1+num2);
            }
           for(int i=0; i<list.size(); i++){
               System.out.println(list.get(i));
           }

        }
}
