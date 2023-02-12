package behavioral.chainofresponsibility;

public interface DispenseChain {
    void setNextChain(DispenseChain dispenseChain);

    void dispense(Money money);
}
