package adapter;

//A회사 메일발송 구현체
public class SolutionA implements MailSenderA {

    @Override
    public void send(String sendInfo) {
        System.out.println("A회사 메일 : " + sendInfo);
    }
}
