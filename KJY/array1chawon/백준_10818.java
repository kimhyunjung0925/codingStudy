package joon.array1chawon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class array1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int getNum = sc.nextInt();
        int[] getArray = new int[getNum];


        for(int i = 0 ; i < getArray.length ; i++){
            getArray[i] = sc.nextInt();
        }

        Arrays.sort(getArray);

        System.out.printf("%d %d",getArray[0],getArray[getNum-1]);

    }
}
