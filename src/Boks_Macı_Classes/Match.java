package Boks_Macı_Classes;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (!isCheck()){
            System.out.println(" ağırlıklar uyumsuz!");
        }
        else{

                while (true){
                    System.out.println("-------------------");
                    if (fifty()) {
                        f1.hit(f2);
                        if (win())
                            break;

                        f2.hit(f1);
                        if (win())
                            break;
                    }
                    else {
                        f2.hit(f1);
                        if (win())
                            break;
                        f1.hit(f2);
                        if (win())
                            break;


                    }











            }

        }

    }

boolean isCheck(){
        return (f1.weight<=this.maxWeight && f1.weight>=this.minWeight)&&(f2.weight<=this.maxWeight && f2.weight>=this.minWeight);
}
public boolean fifty (){
        if (Math.random()*100>50) {
            return true;
        } else
            return false;
}

boolean win(){
        if (f1.heath==0){
            System.out.println(f2.name + " kazandı , kalan canı " + f2.heath);
            return true;
        }
    if (f2.heath==0){
        System.out.println(f1.name + " kazandı , kalan canı " + f1.heath);
        return true;
    }
    else
        return false;


}


}

