package giftsetitems;

import general.Sweet;

public class Jellybean extends Sweet {

    private String nameOfFruitMadeFrom;


    public Jellybean(String name, int weight, double price, String nameOfFruitMadeFrom) {
        super(name, weight, price);
        this.nameOfFruitMadeFrom = nameOfFruitMadeFrom;
    }

    public String getNameOfFruitMadeFrom() {
        return nameOfFruitMadeFrom;
    }

    public void setNameOfFruitMadeFrom(String nameOfFruitMadeFrom) {
        this.nameOfFruitMadeFrom = nameOfFruitMadeFrom;
    }
}
