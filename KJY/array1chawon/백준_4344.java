package joon.array1chawon;

import java.util.Scanner;

public class array7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int studentN = 0;
        int tot = 0;
        float avg = 0;
        int count = 0;
        int scores[] = new int[1000];


        for(int i = 0; i < testCase ; i++){

            studentN = sc.nextInt();
            tot = 0;
            count = 0;


            for(int j = 0; j < studentN ; j++){

                scores[j] = sc.nextInt();
                tot +=scores[j];
            }

            avg = (float)(tot/studentN);

            for(int k = 0 ; k < studentN ; k++){

                if(scores[k] > avg){
                    count++;
                }
            }

            System.out.println(String.format("%.3f",100.0 * count/studentN) + "%");

        }


    }
}
