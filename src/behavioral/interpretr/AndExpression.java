package behavioral.interpretr;

public class AndExpression implements Expression{
    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpreter(String context) {
        return expr1.interpreter(context) && expr2.interpreter(context);
    }

    @Override
    public String toString() {
        return "AndExpression{" +
                "expr1=" + expr1 +
                ", expr2=" + expr2 +
                '}';
    }
}
