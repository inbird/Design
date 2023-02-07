package adapter;

//B회사 메일발송 구현체
public class SolutionB implements MailSenderB {

    @Override
    public void sendFromB(String sendInfo) {
        System.out.println("B회사 메일 : " + sendInfo);
    }
}
