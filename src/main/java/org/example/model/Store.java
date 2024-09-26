package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Dark", 12, "Rich flavor");
        products[1] = new Coke("Coca-cola", 15, "Refreshing");
        products[2] = new Bread("Brown", 8, "Healthy");

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}