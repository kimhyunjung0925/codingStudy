package listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcase = scan.nextInt();
        scan.nextLine();
        ArrayList<String[]> test = new ArrayList<>();
        double[] resultList = new double[testcase];

        for (int i=0; i<testcase; i++) {
            String numAndScore = scan.nextLine();
            String[] oneCaseList = numAndScore.split(" ");
            test.add(oneCaseList);
            int studentNum = Integer.parseInt(oneCaseList[0]);

            int sum = 0;
            for (int z=1; z<=studentNum; z++) {
                int score = Integer.parseInt(oneCaseList[z]);
                sum = sum + score;
            }
            int avg = sum/studentNum;

            int goodStudentNum = 0;
            for (int z=1; z<=studentNum; z++) {
                int score = Integer.parseInt(oneCaseList[z]);
                if (score > avg) {
                    goodStudentNum += 1;
                }
            }
            double percent = ((double)goodStudentNum/studentNum)*100;
            resultList[i] = percent;
        }
        for (int i=0; i<testcase; i++) {
            System.out.printf(String.format("%.3f", resultList[i]));
            System.out.print("%");
            System.out.println();
        }
    }
}
