package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest2 {

    public static void main(String[] args) {
// 컬렉션 생성
        ArrayList<String> cars = new ArrayList<>();
        cars.add("벤츠");
        cars.add("람보르기니");
        cars.add("롤스로이스");
        cars.add("페라리");

        // iterator 획득
        Iterator<String> iterator = cars.iterator();

        while(iterator.hasNext()) {
            String str = iterator.next();
            System.out.println("while : " + str);
        }
        System.out.println();

        for (String str : cars) {
            System.out.println("for : " + str);
        }
    }
}
