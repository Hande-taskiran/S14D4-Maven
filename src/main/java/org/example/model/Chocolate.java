package org.example.model;

public class Chocolate extends ProductForSale{
    private boolean bitter;
    public Chocolate(String type, int price, String description) {
        super(type, price, description);
        isBitter();
    }
    public boolean isBitter() {
        return bitter;
    }

    @Override
    public void showDetails() {
        System.out.println("chocolate type:" +getType()+" price:"+getPrice()+" description:"+getDescription()+" isBitter:"+isBitter());
    }
}
