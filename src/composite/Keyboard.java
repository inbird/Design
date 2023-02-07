package composite;

public class Keyboard extends ComputerDevice {
    private int price;

    public Keyboard(int price) {
        this.price = price;
    }
    @Override
    public int getPrice() {
        return price;
    }
}

