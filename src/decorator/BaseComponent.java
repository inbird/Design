package decorator;

public class BaseComponent implements Component{

    @Override
    public void add() {
        System.out.println("에스프레소 추가");
    }

    @Override
    public int cost() {
        return 1000;
    }
}
