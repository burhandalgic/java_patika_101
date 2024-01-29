package Fibonacci_Sayısını_Bulma;

public class Main {

    static int fibonacci (int x){
        if (x==0||x==1){
            return 1;
        }else
            return fibonacci(x-1)+fibonacci(x-2);





    }

    public static void main(String[] args) {

        System.out.println(fibonacci(5));


}


}


