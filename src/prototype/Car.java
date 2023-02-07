package prototype;

import java.util.ArrayList;
import java.util.List;

public class Car implements Cloneable {

    private List<String> carList;

    public Car() {
        this.carList = new ArrayList<>();
    }

    public Car(List<String> carList) {
        this.carList = carList;
    }

    public List<String> getCarList() {
        return carList;
    }

    public void initLoad() {
        // db에서 자동차의 종류를 가져오는 코드
        this.carList.add("truck");
        this.carList.add("bus");
        this.carList.add("taxi");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Car(new ArrayList<>(this.carList));
    }

    @Override
    public String toString() {
        return "Car{" +
                "carList=" + carList +
                '}';
    }
}
