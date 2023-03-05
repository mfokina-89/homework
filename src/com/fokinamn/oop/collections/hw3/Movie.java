package com.fokinamn.oop.collections.hw3;

import java.util.Objects;

public class Movie {
    private final int id;
    private final int year;
    private final int month;
    private final String genre;
    private final double rating;

    public Movie(int id, int year, int month, String genre, double rating) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.genre = genre;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie" + id +
                " ( " + year + "/" + month + " ), " +
                genre +
                ", rating: " + rating;
    }
}
