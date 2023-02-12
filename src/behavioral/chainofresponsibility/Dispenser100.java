package behavioral.chainofresponsibility;

public class Dispenser100 implements DispenseChain{
    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispense(Money money) {
        if(money.getAmount()>=100){
            int cnt = money.getAmount()/100;
            int remain =money.getAmount()%100;
            System.out.println("100원 거스름돈 :  " + cnt);

            if(remain != 0) {
                this.dispenseChain.dispense(new Money(remain));
            }
        }else{
            this.dispenseChain.dispense(money);
        }
    }
}
