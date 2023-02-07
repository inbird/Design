package bridge;

public abstract class Brush {
    protected Color color;

    protected Brush(Color color) {
        this.color = color;
    }

    public abstract void draw();

}
