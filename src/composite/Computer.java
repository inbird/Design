package composite;

import java.util.ArrayList;
import java.util.List;

public class Computer extends ComputerDevice{
    private List<ComputerDevice> computerDeviceList = new ArrayList<>();

    public void addComponent(ComputerDevice computerDevice){
        computerDeviceList.add(computerDevice);
    }

    public void removeComponent(ComputerDevice computerDevice) {
        computerDeviceList.remove(computerDevice);
    }

    // 전체 가격을 포함하는 각 부품의 가격을 합산
    public int getPrice() {
        int totPrice = 0;
        for(ComputerDevice component : computerDeviceList) {
            totPrice += component.getPrice();
        }
        return totPrice;
    }
}
