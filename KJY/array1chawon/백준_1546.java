package joon.array1chawon;

import java.util.Arrays;
import java.util.Scanner;

public class array5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int classNum = sc.nextInt();
        float newtot = 0;

        float[] scores = new float[classNum];

        for(int  i = 0 ; i < scores.length ; i++){

            scores[i] = sc.nextInt();
        }

        Arrays.sort(scores);


        for(int i = 0 ; i < scores.length ; i++){

            scores[i] = scores[i]/scores[classNum-1]*100;

        }




        for(int i = 0 ; i < scores.length ; i++){

            newtot += scores[i];

        }

        System.out.println(newtot/classNum);

    }
}
