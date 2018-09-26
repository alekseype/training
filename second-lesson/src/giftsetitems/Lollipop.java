package giftsetitems;

import general.Suckable;
import general.Sweet;

public class Lollipop extends Sweet implements Suckable {

    private int lengthOfWand;


    public Lollipop(String name, int weight, double price, int lengthOfWand) {
        super(name, weight, price);
        this.lengthOfWand = lengthOfWand;
    }

    public Lollipop(int weight, double price) {
        super("Lollipop name", weight, price);
        this.lengthOfWand = 5;
    }

    public int getLengthOfWand() {
        return lengthOfWand;
    }

    public void setLengthOfWand(int lengthOfWand) {
        this.lengthOfWand = lengthOfWand;
    }

    @Override
    public void toSuck() {
        System.out.println("yum-yum!");
    }

    @Override
    public String toString() {
        return super.toString() + " , Length of wand: " + this.getLengthOfWand();
    }
}
