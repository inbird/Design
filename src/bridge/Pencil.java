package bridge;

public class Pencil extends Brush {

    public Pencil(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Pencil Draw : " + color.setColor());
    }
}
