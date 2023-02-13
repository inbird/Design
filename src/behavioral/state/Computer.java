package behavioral.state;

public class Computer {
    private State state;

    public Computer() {
        this.state = new PowerOff();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pushButton(){
        state.pushButton();
    }
}
