package joon.array1chawon;

import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class array3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int multNum = num1 * num2 * num3;


        int[] numArray = Stream.of(String.valueOf(multNum).split("")).mapToInt(Integer::parseInt).toArray();
        int[] resultArray = new int[10];


        for(int i = 0; i<numArray.length;i++){

            if(numArray[i] == 0){
                resultArray[0]++;
            }else if(numArray[i] == 1){
                resultArray[1]++;
            }else if(numArray[i] == 2){
                resultArray[2]++;
            }else if(numArray[i] == 3){
                resultArray[3]++;
            }else if(numArray[i] == 4){
                resultArray[4]++;
            }else if(numArray[i] == 5){
                resultArray[5]++;
            }else if(numArray[i] == 6){
                resultArray[6]++;
            }else if(numArray[i] == 7){
                resultArray[7]++;
            }else if(numArray[i] == 8){
                resultArray[8]++;
            }else if(numArray[i] == 9){
                resultArray[9]++;
            }

        }

        for(int val : resultArray){
            System.out.println(val);
        }
    }
}
