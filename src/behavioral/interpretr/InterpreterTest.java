package behavioral.interpretr;

public class InterpreterTest {
    public static Expression getOrExpression(){
        Expression plus = new TerminalExpression("PLUS");
        Expression minus = new TerminalExpression("MINUS");
        return new OrExpression(plus, minus);
    }

    public static Expression getAndExpression(){
        Expression plus = new TerminalExpression("PLUS");
        Expression minus = new TerminalExpression("MINUS");
        return new AndExpression(plus, minus);
    }


    public static void main(String[] args) {
        Expression isOr = getOrExpression();
        Expression isAnd = getOrExpression();

        System.out.println("OR : " + isOr.interpreter("PLUS AND"));
        System.out.println("AND : " + isAnd.interpreter("MINUS AND PLUS"));
    }
}
