package abstractfactory;

public class HybridMoveAttack extends MoveAttackFactory{
    @Override
    public Move createMove() {
        return new NavyMove();
    }

    @Override
    public Attack createAttack() {
        return new AirForceAttack();
    }
}
