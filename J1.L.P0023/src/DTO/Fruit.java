
package DTO;


public class Fruit {
    private String fruitID;
    private String nameFruit;
    private double price;
    private int quantity;
    private String origin;

    public Fruit() {
    }

    public Fruit(String fruitID, String nameFruit, double price, int quantity, String origin) {
        this.fruitID = fruitID;
        this.nameFruit = nameFruit;
        this.price = price;
        this.quantity = quantity;
        this.origin = origin;
    }

    
    
    public String getFruitID() {
        return fruitID;
    }

    public void setFruitID(String fruitID) {
        this.fruitID = fruitID;
    }

    public String getNameFruit() {
        return nameFruit;
    }

    public void setNameFruit(String nameFruit) {
        this.nameFruit = nameFruit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return String.format("%s |%-8s | %-7.1f | %-7d | %-8s", fruitID,nameFruit,price,quantity,origin);
    }
    
    
}
