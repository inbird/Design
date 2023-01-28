package facotory;

public class Navy implements Military {

    @Override
    public void move() {
        System.out.println("배 타고 통통통!!!");
    }

    @Override
    public void attack() {
        System.out.println("배에서 함포로 사격!!!");
    }
}
