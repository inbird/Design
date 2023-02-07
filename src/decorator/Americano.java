package decorator;

public class Americano extends Decorator{

    public Americano(Component component) {
        super(component);
    }

    @Override
    public void add() {
        super.add();
        System.out.println("물 추가");
    }

    @Override
    public int cost() {
        return super.cost() + 0;
    }
}
