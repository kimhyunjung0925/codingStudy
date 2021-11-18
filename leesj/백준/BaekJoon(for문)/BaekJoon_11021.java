//https://www.acmicpc.net/problem/11021
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int count = scan.nextInt();
            int num1;
            int num2;
            List list = new ArrayList();

            for(int i=1; i<=count; i++){
                 num1 = scan.nextInt();
                 num2 = scan.nextInt();
                list.add(num1+num2);
            }
            for(int j=0; j<list.size(); j++) {
                System.out.printf("Case #%d: %d\n", j+1, list.get(j));
            }
        }
}

