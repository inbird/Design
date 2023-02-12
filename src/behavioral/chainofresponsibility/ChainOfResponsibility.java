package behavioral.chainofresponsibility;

public class ChainOfResponsibility {
    private DispenseChain dispenseChain1;

    public ChainOfResponsibility(){
        dispenseChain1 = new Dispenser100();
        DispenseChain dispenseChain2 = new Dispenser10();
        DispenseChain dispenseChain3 = new Dispenser1();

        dispenseChain1.setNextChain(dispenseChain2);
        dispenseChain2.setNextChain(dispenseChain3);
    }

    public static void main(String[] args) {
        ChainOfResponsibility chainOfResponsibility = new ChainOfResponsibility();
        chainOfResponsibility.dispenseChain1.dispense(new Money(200));
    }
}
