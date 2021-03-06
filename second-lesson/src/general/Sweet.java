package general;

public abstract class Sweet implements Eatable {
    private String name;
    private int weight;
    private double price;

    public Sweet(String name, int weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void toEat() {
        System.out.println("Munch! Crunch! general.Sweet!");
    }

    @Override
    public String toString(){
         return "Name: " +  this.getName() + " , Price: " + this.getPrice() + " , Weight: " + this.getWeight();
    }
}
