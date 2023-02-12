package behavioral.command;

public class ComputerOn implements Command{
    private Computer computer;

    public ComputerOn(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.turnOn();
    }
}
