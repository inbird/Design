package facade;

public class Movie {
    private String name="";

    public Movie(String name) {
        this.name = name;
    }
    public void searchMovie() {
        System.out.println(name+" 영화를 검색한다.");
    }
    public void chargeMovie() {
        System.out.println("영화를 결제한다.");
    }
    public void playMovie() {
        System.out.println("영화를 재생한다.");
    }
}
