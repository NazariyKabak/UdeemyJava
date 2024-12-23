package Udemy.Collections.task1;

import java.util.ArrayList;
import java.util.List;

public class Store {

    List<Movie> movies;

    public Store() {
        this.movies = new ArrayList<>();
    }

    public Store(List<Movie> movies) {
        this.movies = movies;
    }

    public Movie getMovies(int index) {
        return new Movie(movies.get(index));
    }

    public void setMovies(int index, Movie movie) {
        this.movies.set(index, new Movie(movie));
    }

    public void addMovie(Movie movie) {
        this.movies.add(new Movie(movie));
    }
}
