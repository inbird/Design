package behavioral.state;

public class PowerSaving implements State {

    @Override
    public void pushButton() {
        System.out.println("절전 모드였는데 전원을 완전히 켭니다.");
    }
}
