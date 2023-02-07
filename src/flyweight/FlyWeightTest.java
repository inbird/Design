package flyweight;

public class FlyWeightTest {
    public static void main(String[] args) {
        String color = "RED";
        String color2 = "BLUE";

        for(int i=0; i<10; i++){
            if( i == 8 ){
                color = color2;
            }
            //팩토리에서 나무 하나 공급받기
            Tree tree = (Tree)TreeFactory.getTree(color);
            System.out.println(i + ", Tree Info : " + tree);
            //나무 x,y 설정하고
            tree.setX((int) (Math.random()*100));
            tree.setY((int) (Math.random()*100));
            //나무 설치하기
            //tree.install();
        }
    }
}
