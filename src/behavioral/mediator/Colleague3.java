package behavioral.mediator;

public class Colleague3 extends Colleague{
    public Colleague3(String name) {
        super(name);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println("Admin can't receive messages");
    }
}
