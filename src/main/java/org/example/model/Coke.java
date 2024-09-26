package org.example.model;

public class Coke extends ProductForSale{
    private boolean diet;
    public Coke(String type, int price, String description) {
        super(type, price, description);
        isDiet();
    }
    public boolean isDiet() {
        return diet;
    }

    @Override
    public void showDetails() {
        System.out.println("coke type:" +getType()+" price:"+getPrice()+" description:"+getDescription()+" isDiet:"+isDiet());
    }
}
