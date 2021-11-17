package whileex;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();
        int num = inputNum;
        int newNum;
        int cycle = 0;

        do {
            int num10 = num/10;
            int num1 = num%10;
            newNum = (num1*10)+((num10+num1)%10);
            num = newNum;

            cycle = cycle+1;
        } while (inputNum != newNum);
        
        System.out.println(cycle);

    }
}
