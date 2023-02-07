package decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Component espresso = new BaseComponent();
        espresso.add();;
        System.out.println("espresso : " + espresso.cost());
        System.out.println();

        Component americano = new Americano(new BaseComponent());
        americano.add();
        System.out.println("americano : " + americano.cost());
        System.out.println();

        Component latte = new Latte(new Americano(new BaseComponent()));
        latte.add();
        System.out.println("latte : " + latte.cost());

    }
}
