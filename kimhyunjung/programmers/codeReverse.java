package programmers;

public class codeReverse {
    public int solution(int n) {
        int answer = 0;
        String ans="";
        StringBuffer sb = new StringBuffer();

        //3진법
        while (n != 0) {
            ans = (n % 3)+ans;
            n /= 3;
        }

        //3진법으로 바꾼걸 앞뒤로 뒤집기
        ans = sb.append(ans).reverse().toString();

        //10진법으로 바꾸기..?
        answer = Integer.parseInt(ans, 3);

        return answer;
    }
}

