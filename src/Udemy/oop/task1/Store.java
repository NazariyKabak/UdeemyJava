package Udemy.oop.task1;

public class Store {
    private Movie[] movies;

    public Store() {
        this.movies = new Movie[10];

    }

    public Movie getMovie(int index) {
        return new Movie(this.movies[index]);

    }

    public void setMovie(int index, Movie movie) {
        this.movies[index] = movie;
    }

    public void displayMovies() {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }


}
