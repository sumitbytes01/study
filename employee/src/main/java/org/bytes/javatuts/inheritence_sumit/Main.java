package org.bytes.javatuts.inheritence_sumit;

public class Main {
    public static void main(String[] args) {
        Animal animal  = new Animal(10000);
        Dog dog = new Dog(10000);

        System.out.println(animal.getWalkingStyle());
        System.out.println(animal.getName());

        System.out.println(animal.getBasePrice());


        System.out.println(dog.getWalkingStyle());
        System.out.println(dog.getName());

        System.out.println(dog.getBasePrice()+dog.additionalCost);
    }
}
