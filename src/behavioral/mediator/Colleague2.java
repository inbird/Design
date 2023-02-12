package behavioral.mediator;

public class Colleague2 extends Colleague{
    public Colleague2(String name) {
        super(name);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println("System can't receive messages");
    }
}
