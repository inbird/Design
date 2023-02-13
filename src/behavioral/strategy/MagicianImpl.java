package behavioral.strategy;

public class MagicianImpl implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("번개를 내리친다.");
    }
}
