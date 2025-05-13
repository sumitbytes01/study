package org.bytes.javatuts.inheritence_sumit;

public class Dog extends Animal{
    int additionalCost = 2000;
    @Override
    public String getName(){
        return "I am Dog";
    }

    public Dog(){
        //super();
    }

    public Dog(int basePrice){
        super(basePrice);
    }
}
