//https://www.acmicpc.net/problem/10871
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int count = scan.nextInt();
            int num = scan.nextInt();
            List<Integer> list= new ArrayList();
            for(int i=1; i<=count; i++){
                list.add(scan.nextInt());
            }
            for(int j=0; j<list.size();j++){
                if(list.get(j)<num){
                    System.out.printf("%d ",list.get(j));
                }
            }

        }
}
