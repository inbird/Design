package builder;

public class BuilderTest {
    public static void main(String[] args) {
        Member member = new Member.Builder("NO1", "HongGilDong")
                .setAge(10)
                .setAddress("KOREA")
                .build();
        System.out.println("member = " + member);
    }
}
