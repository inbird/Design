package composite;

public class Memory extends ComputerDevice {
    private int price;

    public Memory(int price) {
        this.price = price;
    }
    @Override
    public int getPrice() {
        return price;
    }
}

