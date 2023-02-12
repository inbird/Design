package behavioral.chainofresponsibility;

public class Dispenser10 implements DispenseChain{
    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispense(Money money) {
        if(money.getAmount()>=10){
            int cnt = money.getAmount()/10;
            int remain =money.getAmount()%10;
            System.out.println("10원 거스름돈 :  " + cnt);

            if(remain != 0) {
                this.dispenseChain.dispense(new Money(remain));
            }
        }else{
            this.dispenseChain.dispense(money);
        }
    }
}
