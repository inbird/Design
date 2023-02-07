package adapter;

public class AdapterTest {
    public static void main(String[] args) {

        MailSenderA senderA = new SolutionA();
        senderA.send("기존의 메일 발송 로직");

        senderA = new Adapter(new SolutionB());
        senderA.send("변경 후 메일 발송 로직");
    }
}
