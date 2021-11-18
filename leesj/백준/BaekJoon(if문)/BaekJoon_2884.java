//https://www.acmicpc.net/problem/2884
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
int H= scan.nextInt();
int M = scan.nextInt();

if(M>=45){
    M-=45;
    System.out.printf(H+" "+M);

}else{
    if(H<1){
        M+=15;
        System.out.println(23+" "+M);


    }else{
        H-=1;
        M+=15;
        System.out.println(H+" "+M);
    }
}
    }
}