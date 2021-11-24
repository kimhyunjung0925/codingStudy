package 함수;
/*
정수 N개의 합
https://www.acmicpc.net/problem/15596
 */
public class BOJ_15596 {
    public class Test {
        long sum(int[] a){
            long ans = 0;
            for(int c : a){
                ans += c;
            }
            return ans;
        }
    }
}
