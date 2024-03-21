import BeingsOfTheEarth.EarthBeing;
import BeingsOfTheEarth.Human;
import BeingsOfTheEarth.Mammal;
import Common.LivingBeings;
import SkyBeings.Celestialbeing;
import SkyBeings.SkyBeing;

public class LivingBeingCreator implements Creator {

    @Override
    public LivingBeings CreateLivingBeing(String typeofBeing) {

             if ("Human".equalsIgnoreCase(typeofBeing)) {
                return new Human();

             } else if ("Mammal".equalsIgnoreCase(typeofBeing)) {
                return new Mammal();

                } else if ("Celestial".equalsIgnoreCase(typeofBeing)) {
                     return new Celestialbeing();

                } else {
                     System.out.println("Invalid being type");}
        return null;
    }
}
