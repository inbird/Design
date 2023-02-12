package behavioral.mediator;

public class Colleague1 extends Colleague{
    public Colleague1(String name) {
        super(name);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println(this.name + " recevied " +
                colleague.getName() + "'s Message : " +
                colleague.getMessage());
    }
}
