package baekjoon3;

import com.sun.org.apache.xml.internal.resolver.readers.SAXCatalogParser;

import java.util.Scanner;

public class for10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            int n = sc.nextInt();
            if (n < X) {
                System.out.println(n);
            }
        }
    }
}
