package com.fokinamn.oop.collections.hw3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cinema {
    private Map<Integer, List<Movie>> movies;

    public Cinema() {
        this.movies = new HashMap<>();
    }

    public void addMovie(Movie movie) {
        int year = movie.getYear();
        if (!movies.containsKey(year)) {
            movies.put(year, new ArrayList<>());
        }

        List<Movie> movieList = movies.get(year);
        for (Movie movie1 : movieList) {
            if (movie1.getId() == movie.getId()) {
                return; // если такой фильм уже существует
            }
        }
        movieList.add(movie);
    }

    public List<Movie> getMoviesByYear(int year) {
        if (movies.containsKey(year)) {
            return movies.get(year);
        }
        return new ArrayList<>();
    }

    public List<Movie> getMoviesByYearAndMonth(int year, int month) {
        List<Movie> result = new ArrayList<>();
        if (movies.containsKey(year)) {
            List<Movie> movieList = movies.get(year);
            for (Movie movie : movieList) {
                if (movie.getMonth() == month) {
                    result.add(movie);
                }
            }
        }
        return result;
    }

    public List<Movie> getMoviesByGenre(String genre) {
        List<Movie> moviesByGenre = new ArrayList<>();
        for (List<Movie> moviesByYear : movies.values()) {
            for (Movie movie : moviesByYear) {
                if (movie.getGenre().equals(genre)) {
                    moviesByGenre.add(movie);
                }
            }
        }
        return moviesByGenre;
    }

    public List<Movie> getTop10Movies() {
        List<Movie> top10Movies = new ArrayList<>();
        for (List<Movie> moviesInYear : movies.values()) {
            top10Movies.addAll(moviesInYear);
        }
        top10Movies.sort(new RatingComparator().reversed());

        return top10Movies.subList(0, Math.min(10, top10Movies.size()));
    }
}
