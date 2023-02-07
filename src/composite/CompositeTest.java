package composite;

public class CompositeTest {
    public static void main(String[] args) {
        // 컴퓨터의 부품으로 Keyboard, Monitor
        // 신규 부품, 모니터 2개 쓰면???
        Keyboard keyboard = new Keyboard(1000);
        Monitor monitor = new Monitor(10000);

        // Computer 객체를 생성하고 addComponent()를 통해 부품 객체들을 설정
        Computer computer = new Computer();
        computer.addComponent(keyboard);
        computer.addComponent(monitor);

        // 컴퓨터 가격
        int computerPrice = computer.getPrice();
        System.out.println("Computer Price: " + computerPrice );
    }
}
