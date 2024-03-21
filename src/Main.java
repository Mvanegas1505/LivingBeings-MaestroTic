import BeingsOfTheEarth.Human;
import BeingsOfTheEarth.Mammal;
import SkyBeings.Celestialbeing;



public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the world of living beings!!! \n" +
                "Here you will find the most amazing creatures of the universe!!! Mammals, Humans, and Celestial Beings!!");
        System.out.println("-------------------------------------------------------");
        try{

        Creator factoryCreator = new LivingBeingCreator();
        Mammal cow = (Mammal) factoryCreator.CreateLivingBeing("Mammal");
        cow.born();
        cow.grow();
        cow.breatheO2();
        cow.sleep();
        cow.Explore();
        cow.die();

        System.out.println("-------------------------------------------------------");

        Human Pablo = (Human) factoryCreator.CreateLivingBeing("Human");
        Pablo.born();
        Pablo.AdaptToEnvironment();
        Pablo.fly();
        Pablo.Levitate();
        Pablo.Telekinesis();
        Pablo.communicate();
        Pablo.Teleport();
        Pablo.TimeManipulation();
        Pablo.die();

        System.out.println("-------------------------------------------------------");

        Celestialbeing God = (Celestialbeing) factoryCreator.CreateLivingBeing("Celestial");
        God.ChangeDimension();
        God.TimeManipulation();
        God.sleep();
        God.reproduce();

        System.out.println("-------------------------------------------------------");

        Celestialbeing Angel = (Celestialbeing) factoryCreator.CreateLivingBeing("Celestial");
        Angel.fly();
        Angel.Eat();
        Angel.communicate();
        Angel.die();
        Angel.respawn();
        Angel.work();

        }catch (Exception e){
            System.out.println("This being is not defined, please try again with Human, Mammal or Celestial without any typo");
        }

    }
}
