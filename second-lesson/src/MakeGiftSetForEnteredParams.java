import general.Sweet;
import giftsetitems.Candy;
import giftsetitems.Jellybean;
import giftsetitems.Lollipop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MakeGiftSetForEnteredParams {


    public static void main(String[] args) {
        ArrayList<Sweet> sweetsInTheGift = new ArrayList<>();
        int weightOfTheGift;
        double priceOfTheGift;

        try {
            sweetsInTheGift.addAll(getLollipopsForTheGift());
            sweetsInTheGift.addAll(getCandiesForTheGift());
            sweetsInTheGift.addAll(getJellybeansForTheGift());
        } catch (IOException e) {
            e.printStackTrace();
        }

        weightOfTheGift = calculateTotalWeightOfSweets(sweetsInTheGift);
        priceOfTheGift = calculateTotalPriceOfSweets(sweetsInTheGift);
        System.out.println();
        System.out.println("Sweets in the gift set: ");
        System.out.println("Total weight = " + weightOfTheGift);
        System.out.println("Total price = " + priceOfTheGift);
        System.out.println();
        printSweetsInTheGift(sweetsInTheGift);

    }

    private static void printSweetsInTheGift(ArrayList<Sweet> sweetsInTheGift) {
        for (Sweet sweet: sweetsInTheGift){
            System.out.println(sweet.getClass().getSimpleName() + ":");
            System.out.println(sweet.toString());
            System.out.println();
        }
    }

    private static int calculateTotalWeightOfSweets(ArrayList<Sweet> sweetsInTheGift){
        int totalWeight = 0;
        for (Sweet sweet: sweetsInTheGift){
            totalWeight += sweet.getWeight();
        }
        return totalWeight;
    }

    private static double calculateTotalPriceOfSweets(ArrayList<Sweet> sweetsInTheGift){
        double totalPrice = 0;
        for (Sweet sweet: sweetsInTheGift){
            totalPrice += sweet.getPrice();
        }
        return totalPrice;
    }

    private static ArrayList<Lollipop> getLollipopsForTheGift() throws IOException {
        ArrayList<Lollipop> lollipops = new ArrayList<>();
        System.out.print("Enter the number of lollipops in the gift: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfLollipops = 0;
        String name;
        int weight;
        double price;
        int lengthOfWand;
        numberOfLollipops = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= numberOfLollipops; i++){
            System.out.print("Enter name of lollipop " + i + ": ");
            name = reader.readLine();
            System.out.print("Enter weight of lollipop " + i + ": ");
            weight = Integer.parseInt(reader.readLine());
            System.out.print("Enter price of lollipop " + i + ": ");
            price = Double.parseDouble(reader.readLine());
            System.out.print("Enter length of wand of lollipop " + i + ": ");
            lengthOfWand = Integer.parseInt(reader.readLine());
            lollipops.add(new Lollipop(name,weight,price,lengthOfWand));
        }
        return lollipops;
    }

    private static ArrayList<Candy> getCandiesForTheGift() throws IOException {
        ArrayList<Candy> candies = new ArrayList<>();
        System.out.print("Enter the number of candies in the gift: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCandies = 0;
        String name;
        int weight;
        double price;
        boolean hasSack;
        numberOfCandies = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= numberOfCandies; i++){
            System.out.print("Enter name of candy " + i + ": ");
            name = reader.readLine();
            System.out.print("Enter weight of candy " + i + ": ");
            weight = Integer.parseInt(reader.readLine());
            System.out.print("Enter price of candy " + i + ": ");
            price = Double.parseDouble(reader.readLine());
            System.out.print("Candy " + i + " has a sack? ");
            hasSack = Boolean.parseBoolean(reader.readLine());
            candies.add(new Candy(name,weight,price,hasSack));
        }
        return candies;
    }

    private static ArrayList<Jellybean> getJellybeansForTheGift() throws IOException {
        ArrayList<Jellybean> jellybeans = new ArrayList<>();
        System.out.print("Enter the number of jellybeans in the gift: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfJellybeans = 0;
        String name;
        int weight;
        double price;
        String nameOfFruitMadeFrom;
        numberOfJellybeans = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= numberOfJellybeans; i++){
            System.out.print("Enter name of jellybean " + i + ": ");
            name = reader.readLine();
            System.out.print("Enter weight of jellybean " + i + ": ");
            weight = Integer.parseInt(reader.readLine());
            System.out.print("Enter price of jellybean " + i + ": ");
            price = Double.parseDouble(reader.readLine());
            System.out.print("Enter name of fruit jellybean made from" + i + ": ");
            nameOfFruitMadeFrom = reader.readLine();
            jellybeans.add(new Jellybean(name,weight,price,nameOfFruitMadeFrom));
        }
        return jellybeans;
    }
}
