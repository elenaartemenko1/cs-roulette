package money.make.cs.controller;

public class Rifle {
    //Name
    //Float
    //Status
    //Type (ak, m4)
    //StatTrack
    private String name; //поля
    private float qualityFloat;
    private String status;
    private String quality;
    private int statTrack;

    private double dropChance;


    public Rifle(String name, float qualityFloat, String status, String quality, int statTrack, double dropChance){
        this.name=name; //ссылка на текущий класс
        this.qualityFloat=qualityFloat;
        this.status=status;
        this.quality=quality;
        this.statTrack=statTrack;
        this.dropChance=dropChance;



    }


    public Rifle(String name, String quality, double dropChance){
        this.name=name;
        this.quality=quality;
        this.dropChance=dropChance;
    }

    public String toString(){
        return " name= "+this.name+"; qualityFloat= "+this.qualityFloat+"; status= "+this.status+"; type= "+this.quality +"; statTrack= "+this.statTrack;
}

    public String nameandQuality(){
        return " name= "+this.name+"; qualityFloat= "+this.qualityFloat;


    }

    public double getDropChance(){
        return dropChance;


    }








}
