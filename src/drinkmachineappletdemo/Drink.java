/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkmachineappletdemo;

/**
 *
 * @author Rosemol
 */
public class Drink {
    private String name;
    private int stock;
    private double price;
    final int FULL_STOCK=3;
    final double PRICE=0.75;
    public Drink(){
        this("");
    }
    public Drink(String name){
        this.name=name;
        stock=FULL_STOCK;
        price=PRICE;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
