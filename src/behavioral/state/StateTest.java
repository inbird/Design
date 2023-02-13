package behavioral.state;

public class StateTest {
    public static void main(String[] args) {
        Computer computer = new Computer();

        State powerOff = new PowerOff();
        State powerOn = new PowerOn();
        State powerSaving = new PowerSaving();

        computer.pushButton();
        computer.setState(powerOn);
        computer.pushButton();
        computer.setState(powerSaving);
        computer.pushButton();
        computer.setState(powerOff);
        computer.pushButton();
    }
}
