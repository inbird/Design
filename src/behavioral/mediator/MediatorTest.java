package behavioral.mediator;

public class MediatorTest {
    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();
        Colleague colleague1 = new Colleague1("User1");
        Colleague colleague2 = new Colleague1("User2");
        Colleague colleague3 = new Colleague2("System");
        Colleague colleague4 = new Colleague3("Admin");

        colleague1.setMediator(mediator);
        colleague2.setMediator(mediator);
        colleague3.setMediator(mediator);
        colleague4.setMediator(mediator);

        mediator.addColleague(colleague1);
        mediator.addColleague(colleague2);
        mediator.addColleague(colleague3);
        mediator.addColleague(colleague4);

        colleague1.setMessage("I'm User1");
        colleague1.send();
        colleague2.setMessage("How are you?");
        colleague2.send();

    }
}
