import java.util.Scanner;
// 곱셈
// https://www.acmicpc.net/problem/2588
public class BOJ_2588 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = 0, num4 = num2;
		int i = 0, j =3;
		
		while(true) {
			if ( i == j)
				break;
			num3 = num1 * (num2%10);
			System.out.println(num3);
			num2 /=10;
			
			i++;
		}
		
		System.out.println(num1*num4);

	}

}
