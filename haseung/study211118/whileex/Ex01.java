package whileex;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<int[]> ablist = new ArrayList<int[]>();
        while (true) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            int[] ab = new int[] {a, b};
            ablist.add(ab);
        }

        for (int i=0; i<ablist.size(); i++) {
            int sum = ablist.get(i)[0] + ablist.get(i)[1];
            System.out.println(sum);
        }
    }
}
