package TUF.STEP1.BasicRecursion;

public class Fibonacci {


//O(2^n)
    static int fib(int n){
        if(n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }

//O(n)
    static int fibo(int n,int a,int b){
        if(n<=0) return a;
//        System.out.println(a);
        return fibo(n-1,b,a+b);
    }
    public static void main(String[] args) {
        System.out.println(fibo(6,0,1));
        System.out.println(fib(6));   //not efficient method as makes two tree call

    }
}
