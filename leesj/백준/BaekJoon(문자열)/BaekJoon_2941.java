//https://www.acmicpc.net/problem/2941
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        String[] arr = {"c=","c-","d-","lj","nj","s=","z="};
        int count=0;
        String str2="";
        for(int i=0; i<str.length(); i++){
            if(i+3<=str.length()){ //3글자 이상일때
                str2 = str.substring(i,i+3);
                if(str2.equals("dz=")){
                    i+=2;
                    count++;
                    continue;
                }
            }
            if(i+2<=str.length()){ //2글자 이상일때
                str2 = str.substring(i,i+2);

                for(int j=0; j<arr.length; j++){
                    if(str2.equals(arr[j])){
                        i++;
                        break;
                    }
                }
            }
            count++;
        }
        System.out.println(count);

    }
}


