package org.bytes.javatuts.inheritence_sumit;

public class Animal {
    private int basePrice;

    public Animal(){

    }

    public Animal(int basePrice){
        this.basePrice = basePrice;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public String getWalkingStyle(){
        return "I walk on 4 legs";
    }

    public String getName(){
        return "I am Animal";
    }

}
