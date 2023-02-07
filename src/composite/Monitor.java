package composite;

public class Monitor extends ComputerDevice {
    private int price;

    public Monitor(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}

