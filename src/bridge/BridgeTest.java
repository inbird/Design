package bridge;

class BridgeTest {

    public static void main(String[] args) {
        Brush brush = new Pencil(new Red());
        brush.draw();
        brush = new BallPen(new Blue());
        brush.draw();
    }
}
