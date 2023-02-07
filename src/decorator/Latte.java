package decorator;

public class Latte extends Decorator{
    public Latte(Component component) {
        super(component);
    }

    @Override
    public void add() {
        super.add();
        System.out.println("우유 추가");
    }

    @Override
    public int cost() {
        return super.cost() + 500;
    }
}
