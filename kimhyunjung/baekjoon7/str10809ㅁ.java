package baekjoon7;

import java.util.Scanner;

public class str10809ㅁ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); //String 문자열 한줄 입력

        for (char c = 'a' ; c <= 'z' ; c++) //a~z까지 for
            System.out.print(input.indexOf(c) + " "); //특정문자 위치 찾기 없으면 자동-1리턴임
    }
}
// a~z까지 차례대로 문자열 비교(총26개)
// ex)a=배열1번째니까 2출력, b=배열0번째니까 1출력, 없으면 -1출력
