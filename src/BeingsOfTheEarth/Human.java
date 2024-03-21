package BeingsOfTheEarth;

import Common.LivingBeings;
import SkyBeings.SkyBeing;

public class Human extends LivingBeings implements EarthBeing, SkyBeing {

    @Override
    public void born() {
        System.out.println("Welcome to this beautiful world Human");

    }

    @Override
    public void grow() {
        System.out.println("Growing up..." + "I'm getting older...");
        
    }


    @Override
    public void reproduce() {
        System.out.println("Noche de intensa pasion..." + "9 months later..." + "Welcome to the world, little one...");}

    @Override
    public void respawn() {
        System.out.println("Respawn:" + "Setting new world....");}

    @Override
    public void die() {
        System.out.println("Dying... Goodbye cruel world");}

    @Override
    public void learn() {
        System.out.println("Learning from the mistakes of the past..." + " Reaching my prime \n");}

    @Override
    public void communicate() {
        System.out.println("Hello? Can you hear me? I'm talking to you!!!" + " Hello?... Is anyone here? pls help me get out of this code!!! ");}

    @Override
    public void work() {
        System.out.println("Working..." + " The bills don't pay themselves...");}

    @Override
    public void sleep() {
        System.out.println("Sleeping..." + " Zzzzzzz" + " Do not disturb...");}

    @Override
    public void AdaptToEnvironment() {
        System.out.println("Getting used to this new life..." + " Adapting to deal with myself...");
    }

    @Override
    public void Move() {

        System.out.println("Walking through the packages of this code..." + " Stretching a bit up the legs");

    }

    @Override
    public void Eat() {
        System.out.println("YUMMY YUMMY" + "Nor the best, nor the worst, but it's food... + eat or human.die");
    }

    @Override
    public void breatheO2() {
        System.out.println("Breathing..." + " Inhale... Exhale... Sniff Sniff");}

    @Override
    public void Explore() {
        System.out.println("Finding the end of this code..." + " Exploring the unknown...");}

    @Override
    public void fly() {

        System.out.println("OMFG I'm flying!!!" + " I'm a bird, I'm a plane, I'm a superman!!" + " First Human ever to do it!!");}

    @Override
    public void ChangeDimension() { System.out.println("Changing dimension... ¡whoosh!"); }

    @Override
    public void Levitate() {
        System.out.println("The Milky way, we´re renegading " + "Ohhh no me malviajé ayuda");}



    @Override
    public void Telekinesis() { System.out.println("Moving an object with my mind!!");

    }

    @Override
    public void MindControl() { System.out.println("I'm controlling your mind rn, I force you to get me out of this code");}

    @Override
    public void Teleport() {
        System.out.println("Teleporting..." + " where am i? WHY I GOT TELEPORTED TO A JAVA CODE HELP!!!");}

    @Override
    public void TimeManipulation() {

        System.out.println("Feeling like back to the future. Marty prepare for landing!!");}


}
