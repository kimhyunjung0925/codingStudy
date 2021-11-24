package joon.fuction;

import java.util.Arrays;
import java.util.Scanner;

public class function1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];

        for(int i = 0 ;  i < array.length ; i++){
             array[i] = sc.nextInt();
        }

        System.out.println(sum(array));

    }

    static long sum(int[] a){

        long tot=0;

        for (int i = 0 ; i < a.length ; i++){
            tot+=a[i];
        }

        return tot;
    }
}
