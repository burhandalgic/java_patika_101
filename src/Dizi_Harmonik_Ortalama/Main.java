package Dizi_Harmonik_Ortalama;

public class Main {

    static double harmonik (double[] list){
        double sum=0;
        for( double x:list){
            sum=sum+(1/x);
        }
        return (list.length/sum);
    }

    public static void main(String[] args) {

        double[] list = {2,3};
        System.out.println(harmonik(list));


}


}


