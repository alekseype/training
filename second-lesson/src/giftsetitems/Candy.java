package giftsetitems;

import general.Sweet;

public class Candy extends Sweet {
    private boolean hasSack;

    public Candy(String name, int weight, double price, boolean hasSack) {
        super(name, weight, price);
        this.hasSack = hasSack;
    }

    public Candy(String name, int weight, double price){
        super(name, weight, price);
        this.hasSack = false;
    }

    public Candy(int weight, double price){
        super("Candy sweet", weight, price);
        this.hasSack = false;
    }

    public boolean isHasSack() {
        return hasSack;
    }

    public void setHasSack(boolean hasSack) {
        this.hasSack = hasSack;
    }




}
