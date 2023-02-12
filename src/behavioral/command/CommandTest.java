package behavioral.command;

public class CommandTest {
    public static void main(String[] args) {
        Computer computer = new Computer();

        Command computerOn = new ComputerOn(computer);
        Command computerOff = new ComputerOff(computer);

        Button btn = new Button(computerOn);
        btn.pressButton();
        btn.setCommand(computerOff);
        btn.pressButton();
    }
}
