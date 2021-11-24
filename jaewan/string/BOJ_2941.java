package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt=0;

        for(int i=0; i<str.length(); i++) {
            try {
                if (str.charAt(i) == 'c') {
                    if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                        cnt++;
                        i++;
                        continue;
                    }
                }
            } catch (Exception e){
                cnt++;
                continue;
            }
            try {
                if (str.charAt(i) == 'd') {
                    if (str.charAt(i + 1) == 'z') {
                        if (str.charAt(i + 2) == '=') {
                            cnt++;
                            i = i + 2;
                            continue;
                        }
                    }
                }
            } catch (Exception e){
                cnt++;
                continue;
            }
            try {
                if (str.charAt(i) == 'd') {
                    if (str.charAt(i + 1) == '-') {
                        cnt++;
                        i++;
                        continue;
                    }
                }
            } catch (Exception e){
                cnt++;
                continue;
            }
            try {
                if (str.charAt(i) == 'l') {
                    if (str.charAt(i + 1) == 'j') {
                        cnt++; i++;
                        continue;
                    }
                }
            } catch (Exception e){
                cnt++;
                continue;
            }
            try {
                if (str.charAt(i) == 'n') {
                    if (str.charAt(i + 1) == 'j') {
                        cnt++; i++;
                        continue;
                    }
                }
            } catch (Exception e){
                cnt++;
                continue;
            }
            try {
                if (str.charAt(i) == 's') {
                    if (str.charAt(i + 1) == '=') {
                        cnt++; i++;
                        continue;
                    }
                }
            } catch (Exception e){
                cnt++;
                continue;
            }
            try {
                if (str.charAt(i) == 'z') {
                    if (str.charAt(i + 1) == '=') {
                        cnt++;
                        i++;
                        continue;
                    }
                }
            } catch (Exception e){
                cnt++;
                continue;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
