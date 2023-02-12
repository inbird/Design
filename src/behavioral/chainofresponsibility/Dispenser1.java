package behavioral.chainofresponsibility;

public class Dispenser1 implements DispenseChain{
    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispense(Money money) {
        System.out.println("1원 거스름돈 :  " + money.getAmount());
    }
}
