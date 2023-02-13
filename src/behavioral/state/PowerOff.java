package behavioral.state;

public class PowerOff implements State {

    @Override
    public void pushButton() {
        System.out.println("전원이 꺼져 있었는데 절전 모드로 켭니다.");
    }
}
