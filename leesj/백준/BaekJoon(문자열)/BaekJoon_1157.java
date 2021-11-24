//https://www.acmicpc.net/problem/1157
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        String word="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] chs= str.toCharArray();
        char[] alphabet = word.toCharArray();
        for(int i =0; i< chs.length; i++){
            if(chs[i]>90){
                chs[i]=(char)(chs[i]-32);
            }
        }
        int count;
        int Maxcount=0;
        String result = "?";
        for(int i=0; i<alphabet.length; i++) {
            count=0;
            for (int j = 0; j < chs.length; j++) {
                if (alphabet[i] == chs[j]) {
                    count++;
                }
            }

            if(Maxcount<count){
                Maxcount = count;
                result = String.valueOf(alphabet[i]);
            }else if(Maxcount == count){
                result = "?";
            }

        }
        System.out.println(result);

    }
}


