import general.Sweet;
import giftsetitems.Candy;
import giftsetitems.Jellybean;
import giftsetitems.Lollipop;

import java.util.ArrayList;

public class MakeDefaultGift {
    public static ArrayList<Sweet> sweetsInDefaultGift = new ArrayList<>();
    public static int weightOfTheGift;
    public static double priceOfTheGift;

    public static void addSweetsToTheGift(){
        sweetsInDefaultGift.add(new Lollipop("Nice lollipop #1",23,32.00,7));
        sweetsInDefaultGift.add(new Candy("Candy #1",34, 56.23));
        sweetsInDefaultGift.add(new Jellybean("Jellybean #1",11,21.3,"Cherry"));
        sweetsInDefaultGift.add(new Jellybean("Jellybean #2",16,26.1,"Raspberry"));
    }

    public static void printSweetsInTheGift() {
        System.out.println("Sweets in the gift set: ");
        System.out.println("Total weight = " + weightOfTheGift);
        System.out.println("Total price = " + priceOfTheGift);
        System.out.println();
        for (Sweet sweet: sweetsInDefaultGift){
            System.out.println(sweet.getClass().getSimpleName() + ":");
            System.out.println("Name: " +  sweet.getName() + " , Price: " + sweet.getPrice() + " , Weight: " + sweet.getWeight());
            System.out.println();
        }
    }

    public static int calculateTotalWeightOfSweets(){
        int totalWeight = 0;
        for (Sweet sweet: sweetsInDefaultGift){
            totalWeight += sweet.getWeight();
        }
        return totalWeight;
    }

    public static double calculateTotalPriceOfSweets(){
        double totalPrice = 0;
        for (Sweet sweet: sweetsInDefaultGift){
            totalPrice += sweet.getPrice();
        }
        return totalPrice;
    }

    public static void main(String[] args) {
        addSweetsToTheGift();
        weightOfTheGift = calculateTotalWeightOfSweets();
        priceOfTheGift = calculateTotalPriceOfSweets();
        printSweetsInTheGift();

    }
}
