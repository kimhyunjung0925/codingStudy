package boj;

public class BOJ_15596 {
    public static void main(String[] args) {
        int[] b = {1,2,3,4,5};
    }
}

class Test{
     long sum(int[] a){
        long sum = 0;
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }
        return sum;
    }
}
