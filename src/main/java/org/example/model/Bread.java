package org.example.model;

public class Bread extends ProductForSale{
    private boolean sliced;
    public Bread(String type, int price, String description) {
        super(type, price, description);
        isSliced();
    }
    public boolean isSliced() {
        return sliced;
    }

    @Override
    public void showDetails() {
        System.out.println("bread type:" +getType()+" price:"+getPrice()+" description:"+getDescription()+" isSliced:"+isSliced());
    }
}
