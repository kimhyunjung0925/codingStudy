//https://www.acmicpc.net/problem/10809
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       char[] chs ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
       String str =scan.next();
        char[] word = str.toCharArray();
        int[] result = new int[chs.length];
        for(int i=0; i<chs.length; i++){
            result[i] = -1;
        }

        for(int i=0; i< word.length; i++){
            for(int j=0; j<chs.length; j++){
                if(word[i]==chs[j]){
                    if(result[j]==-1){
                        result[j]=i;    
                    }
                    break;
                }
            }
        }

        for(int i =0; i< result.length; i++){
            System.out.printf("%d ",result[i]);
        }
    }
}


