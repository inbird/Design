package abstractfactory;

public class NavyMoveAttackFactory extends MoveAttackFactory{
    @Override
    public Move createMove() {
        return new NavyMove();
    }

    @Override
    public Attack createAttack() {
        return new NaviAttack();
    }
}
