package facotory;

public class AirForce implements Military {

    @Override
    public void move() {
        System.out.println("비행기 쉬~잉 날아간다!!");
    }

    @Override
    public void attack() {
        System.out.println("비행기에서 공대지 미사일 발사!!!");
    }
}
