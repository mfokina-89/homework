package com.fokinamn.oop.collections.hw3;

public class CinemaRunner {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.addMovie(new Movie(1,2011, 12, "Comedy", 8.5));
        cinema.addMovie(new Movie(23, 2000, 5, "Drama", 6.8));
        cinema.addMovie(new Movie(14, 2011, 4,"Horror", 5.4));
        cinema.addMovie(new Movie(7, 1999, 9, "Comedy", 7.0));
        cinema.addMovie(new Movie(5, 2015, 2, "Triller", 6.1));
        cinema.addMovie(new Movie(23, 2004, 7,"Comedy", 6.2));

        System.out.println(cinema.getMoviesByYear(2011));
        System.out.println(cinema.getMoviesByYearAndMonth(2015,2));
        System.out.println(cinema.getMoviesByGenre("Comedy"));
        System.out.println(cinema.getTop10Movies());
    }
}
