package behavioral.strategy;

public class HealerImple implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("아군을 치료합니다.");
    }
}
