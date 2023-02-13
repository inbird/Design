package behavioral.observer;

public class ObserverTest {
    public static void main(String[] args) {
        NewsPublisher newsPublisher = new NewsPublisher();

        NewsSubscriber newsSubscriber1 = new NewsSubscriber("홍길동", newsPublisher);
        NewsSubscriber newsSubscriber2 = new NewsSubscriber("마동석", newsPublisher);

        newsPublisher.setNews("속보", "최초 테스트");
        newsPublisher.setNews("날씨", "무진장 춥습니다");

        newsPublisher.removeObserver(newsSubscriber1);
        newsPublisher.setNews("회원변경", "구독해지함");
    }
}
