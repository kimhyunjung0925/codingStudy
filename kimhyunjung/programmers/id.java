package programmers;

import java.util.Locale;

public class id {
    public String solution(String new_id) {

        //1.대문자로 치환
        String answer = new_id.toLowerCase();

        //2.특정문자빼고 제거
        // ^ = 아닌 것,  0-9(숫자), a-z(소문자)
        answer = answer.replaceAll("[^0-9a-z-_.]", "");

        //3.연속마침표
        // .이 두개 이상일 때
        answer = answer.replaceAll("[.]{2,}", ".");

        //4.마침표 처음과 끝
        answer = answer.replaceAll("^\\.|\\.$", "");

        //5.빈문자열 a대입
        if(answer.equals(""))  answer += "a";

        //6. 16자리 이상시 앞에서 15개 제외 삭제, 마지막에 .이 있으면 삭제
        // 15자리만 남기기
        if(answer.length() >= 16)
        answer = answer.substring(0,15);

        //마지막에 .이 있으면 삭제
        answer = answer.replaceAll("[.]{1}$", "");


        //7. 길이 2자 이하시 마지막 문자를 길이 3될때 까지 반복해서 넣기
        if(answer.length() <= 2) {
            for(int i = answer.length(); i < 3; i++){
                answer += answer.substring(answer.length()-1);
            }
        }
        return answer;
    }
}
