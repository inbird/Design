package facotory;

public class FactoryTest {
    public static void main(String[] args) {
        String str = "navy";


        Military military1 = new MilitaryFactory().getMilitary(str);
 //       Military military2 = new MilitaryFactory().getMilitary("airforce");

        military1.move();
        military1.attack();
        //System.out.println();

//        military2.move();
//        military2.attack();

    }
}
