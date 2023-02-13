package behavioral.memento;

public class MementoTest {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State10");
        originator.setState("State20");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State30");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State40");

        System.out.println("현재상태 : " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("첫번째 저장 : " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("두번째 저장 : " + originator.getState());

    }
}
