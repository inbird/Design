package facade;

public class Facade {
    private String beverageName ="";
    private String movieName ="";

    public Facade(String beverageName,String movieName) {
        this.beverageName=beverageName;
        this.movieName=movieName;
    }

    public void viewMovie() {
        Beverage beverage = new Beverage(beverageName);
        TV tv = new TV();
        Movie movie = new Movie(movieName);

        beverage.readyBeverage();
        tv.turnOn();
        movie.searchMovie();
        movie.chargeMovie();
        movie.playMovie();
    }
}
