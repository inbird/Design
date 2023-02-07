package abstractfactory;

public class AbstrackFactoryTest {
    public static void main(String[] args) {
        //MoveAttackFactory moveAttackFactory = new NavyMoveAttackFactory();
        //MoveAttackFactory moveAttackFactory = new AirForceAttackFactory();
        MoveAttackFactory moveAttackFactory = new HybridMoveAttack();

        Move move = moveAttackFactory.createMove();
        Attack attack = moveAttackFactory.createAttack();

        move.move();
        attack.attack();
    }
}
