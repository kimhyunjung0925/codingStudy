package joon.fuction;

import javafx.scene.transform.Scale;

import java.util.Scanner;
import java.util.stream.Stream;

public class function3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(Hansu(num));

    }

    static public int Hansu(int num){

        int result = 99;


        if(num <= 100 && num > 0){
          return num;
        }else if(num>100){

            for(int i = 100 ; i<= num ;i++)
            {
                int[] array = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).toArray();
                if(array[0] - array[1] == array[1] - array[2])
                {
                    result++;
                }
            }
            return result;
        }

       return 0;
    }
}
