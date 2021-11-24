package baekjoon.function;

public class Function4673 {
    public static void main(String[] args) {
        boolean[] all = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            int n = d(i);
            if(n <= 10000){
                all[n] = true;
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if (!all[i]) {
                System.out.println(i);
            }
        }
    }

    public static int d(int n){
        int sum = n;

        while (n != 0){
            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }
}
