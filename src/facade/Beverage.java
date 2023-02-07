package facade;

public class Beverage {
    private String name="";

    public Beverage(String name) {
        this.name = name;
    }

    public void readyBeverage() {
        System.out.println(name+" 음료수 준비 완료");
    }
}
