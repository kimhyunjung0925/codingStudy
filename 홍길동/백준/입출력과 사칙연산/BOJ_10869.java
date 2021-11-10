import java.util.Scanner;
// 사칙연산
// https://www.acmicpc.net/problem/10869
public class BOJ_10869 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int[] c = new int[5];  
				
		c[0] = a+b; 
		c[1] = a-b;
		c[2] = a*b;
		c[3] = a/b;
		c[4] = a%b;
		
		for(int i=0; i < c.length; i++) {
			System.out.printf("%d\n", c[i]);	
		}

	}

}