package behavioral.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Character warrior = new Character(new WarriorImpl());
        Character magician = new Character(new MagicianImpl());
        Character healer = new Character(new HealerImple());

        warrior.attack();
        magician.attack();
        healer.attack();
    }
}
