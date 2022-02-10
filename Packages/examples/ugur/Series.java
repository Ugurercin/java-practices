package examples.ugur;

import org.w3c.dom.ls.LSOutput;

public class Series {
    public static void main(String[] args) {
        System.out.println(nSum(10));
        System.out.println(factorial(3));
    }


    public static long nSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static long factorial(int n) {
        if(n==0) {
            return 1;
        } else {
            long factorial = 1;
            for(int i = 1; i <=n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }


}
