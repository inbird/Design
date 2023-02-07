package decorator;

public class Decorator implements Component{
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void add() {
        component.add();
    }

    @Override
    public int cost() {
        return component.cost();
    }
}
