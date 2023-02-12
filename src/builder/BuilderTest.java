package builder;

public class BuilderTest {
    public static void main(String[] args) {
        Member member = new Member.Builder("NO1", "HongGilDong")
                .setAge(30)
                .setAddress("서초동")
                .build();

        System.out.println("member = " + member);
    }
}
