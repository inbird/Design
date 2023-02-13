package behavioral.state;

public class PowerOn implements State {

    @Override
    public void pushButton() {
        System.out.println("전원이 켜져 있었는데 전원을 끕니다.");
    }
}
