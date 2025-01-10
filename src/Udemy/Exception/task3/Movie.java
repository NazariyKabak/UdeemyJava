package Udemy.Exception.task3;

public class Movie {
    private String name;
    private double rating;
    private String format;

    public Movie(String name, double rating, String format) {
        this.name = name;
        this.rating = rating;
        this.format = format;
    }

    public Movie(Movie source) {
        this.name = source.name;
        this.rating = source.rating;
        this.format = source.format;
    }

    public String getName() {
        return this.name;
    }

    public double getRating() {
        return this.rating;
    }

    public String getFormat() {
        return this.format;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
    }

    public void setRating(double rating) {
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("Rating must be between 0 and 10");
        }
        this.rating = rating;
    }

    public void setFormat(String format) {
        if (format == null || format.isBlank()) {
            throw new IllegalArgumentException("Format cannot be null");
        }
        this.format = format;
    }

}
