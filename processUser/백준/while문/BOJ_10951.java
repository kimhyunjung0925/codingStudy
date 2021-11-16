package while문;
import java.io.*;
import java.util.StringTokenizer;
/*
A+B - 4
https://www.acmicpc.net/problem/10951
 */
public class BOJ_10951 {
    public static void main(String[] args) throws IOException{
        // 참고 - https://hennie-dev.tistory.com/29
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        while (true){
//        while (!(str = br.readLine()).equals("")){ // NullPointer 에러
            try {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                bw.write(a + b + "\n");
            } catch (Exception e){
                break;
            }
        }
        bw.flush();
    }
}
