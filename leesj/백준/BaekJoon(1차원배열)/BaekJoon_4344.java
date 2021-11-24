//https://www.acmicpc.net/problem/4344
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int case_num = scan.nextInt();
        int [] arr= new int[case_num];
        double score; //평균점수
        int []test;  //한개의 배열
        double []percent = new double[case_num]; //배열의 각 퍼센트
        int sum = 0; // 총 점수
        int count=0; // 평균이상 수
        for(int i=0; i<arr.length; i++){ //케이스수
            int score_num = scan.nextInt(); //하나의 배열 크기
            test = new int[score_num];
            for(int j=0; j<score_num; j++){
                test[j] = scan.nextInt();
                sum+=test[j];
            }
//            System.out.println("sum:"+sum);
            score= (double)sum/score_num;
//            System.out.println("score:"+score);
            for(int j=0; j<score_num; j++){ //배열 크기
                if(score<test[j]){
                    count++;
                }
            }
//            System.out.println(count);

            percent[i] =  (double)count/score_num*100;
            percent[i] = Math.round(percent[i]*1000)/1000.0;
            count = 0;
            sum=0;
        }


        for(int i=0; i<case_num; i++){
            System.out.printf("%.3f",percent[i]);
            System.out.println("%");
        }
    }
}