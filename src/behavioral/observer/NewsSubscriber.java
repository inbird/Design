package behavioral.observer;

public class NewsSubscriber implements Observer {

    private String userName;
    private String news;
    private Publisher publisher;

    public NewsSubscriber(String userName, Publisher publisher) {
        this.userName = userName;
        this.publisher = publisher;
        publisher.registerObserver(this);
    }

    @Override
    public void update(String title, String news) {
        this.news = title + ":" + news;
        display();
    }

    private void display(){
        System.out.println(userName + " 님이 수신한 뉴스 내용은[ " + news + " ]입니다.");
    }
}
