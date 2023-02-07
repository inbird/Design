package flyweight;

import java.util.HashMap;

public class TreeFactory {
    public static final HashMap<String, Tree> treeMap = new HashMap<>();

    public static Tree getTree(String treeColor){
        //Map에 입력받은 색상의 나무가 있는지 찾습니다. 있으면 그 객체를 제공합니다.
        Tree tree = (Tree)treeMap.get(treeColor);

        //만약 아직 같은 색상의 나무가 Map에 없다면 새로 객체를 생성해 제공합니다.
        if(tree == null){
            tree = new Tree(treeColor);
            treeMap.put(treeColor, tree);
            System.out.println(treeColor + " 색상의 새로운 Tree 객체 생성");
        }
        return tree;
    }
}
