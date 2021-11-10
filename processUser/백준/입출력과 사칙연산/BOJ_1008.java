import java.util.Scanner;
// A/B
// https://www.acmicpc.net/problem/1008
public class BOJ_1008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		double c = a/(double)b;
		
		System.out.printf("%.11f", c);

	}

}