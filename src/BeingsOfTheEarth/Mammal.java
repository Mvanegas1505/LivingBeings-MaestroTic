package BeingsOfTheEarth;

import Common.LivingBeings;

public class Mammal extends LivingBeings implements EarthBeing {



    @Override
    public void work() {
        System.out.println("Animal working on catching his food");}
    @Override
    public void breatheO2() {
        System.out.println("Mammal Inhaling Oxygen and exhaling CO2");}

    @Override
    public void Explore() {
        System.out.println("Mammal is exploring in the find of food and shelter.");}

    @Override
    public void born() { System.out.println("Welcome to this world Mammal!");}

    @Override
    public void grow() {
        System.out.println("Mammal is growing very fast");}

    @Override
    public void reproduce() {
        System.out.println("Mammal is creating little Mammals with his Mammal Wife!!!");}
    @Override
    public void die() {

        System.out.println("Mammal died killed by wildlings :(");

    }

    @Override
    public void learn() {

        System.out.println("Mammal is learning how to survive in the wild");}

    @Override
    public void communicate() {
        System.out.println("... .... ...Mammal making unrecognizable sounds for humans to understand");}
    @Override
    public void sleep() {
        System.out.println("Mammal is taking a nap");}

    @Override
    public void AdaptToEnvironment() {
        System.out.println("Mammal is adapting to the new sorroundings...");}

    @Override
    public void Move() {
        System.out.println("Mammal is walking through the obstacles of the wild");

    }

    @Override
    public void Eat() {
        System.out.println("ñam ñam, Delicious meal");

    }
}







