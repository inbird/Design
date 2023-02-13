package behavioral.strategy;

public class WarriorImpl implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("칼로 공격한다.");
    }
}
