import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       String Num1 = sc.next();
       String Num2 = sc.next();

       String[] array = Num2.split("");


       for(int i = (array.length-1); i >= 0 ; i--)
       {
           System.out.println((Integer.parseInt(Num1)) * (Integer.parseInt(array[i])) );
       }

        System.out.println((Integer.parseInt(Num1)) * (Integer.parseInt(Num2)));

    }



}

