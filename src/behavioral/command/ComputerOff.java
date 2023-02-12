package behavioral.command;

public class ComputerOff implements Command {
    private Computer computer;

    public ComputerOff(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.turnOff();
    }
}
