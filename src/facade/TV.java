package facade;

//음료를 준비한다 -> TV를 켠다 -> 영화를 검색한다 -> 영화를 결제한다 -> 영화를 재생한다.
public class TV {
    public void turnOn() {
        System.out.println("TV를 켜다");
    }
    public void turnOff(){
        System.out.println("TV를 끄다");
    }
}
