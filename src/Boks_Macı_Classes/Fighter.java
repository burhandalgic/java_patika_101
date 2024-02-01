package Boks_Macı_Classes;

public class Fighter {
    String name;
    int heath;
    int weight;
    int damageScore;
    int blockScoreLuck;

    public Fighter(String name, int heath, int weight, int damageScore, int blockScoreLuck) {
        this.name = name;
        this.heath = heath;
        this.weight = weight;
        this.damageScore = damageScore;
        this.blockScoreLuck = blockScoreLuck;
    }


    public boolean block (){
        if (Math.random()*100<=blockScoreLuck) {
            return true;
        } else
            return false;
    }
    public void hit (Fighter fx){
        System.out.println(this.name + " vurdu " + fx.name + " a " );
        if (fx.block()){
            System.out.println(fx.name + " blokladı");
        return;
        }
        else{
        fx.heath=fx.heath-this.damageScore;
        if (fx.heath<0)
            fx.heath=0;
            System.out.println(fx.name + " in yeni canı " + fx.heath);
        }
    }


}
