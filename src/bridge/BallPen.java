package bridge;

public class BallPen extends Brush {

    public BallPen(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("BallPen Draw : " + color.setColor());
    }
}
