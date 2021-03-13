/*
 * @author Vipul Thakur
 * @email vipul01.thakur@gmail.com
 */

package com.insignia.webBookmark.entities;

import com.insignia.webBookmark.constants.MovieGenre;

import java.util.Arrays;

public class Movie extends Bookmark {
    private int releaseYear;
    private String[] cast;
    private String[] directors;
    private String genre;
    private double imdbRating;

    @Override
    public boolean isKidFriendlyEligible() {
        return !getGenre().equals(MovieGenre.HORROR) && !getGenre().equals(MovieGenre.THRILLERS);
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String[] getCast() {
        return cast;
    }

    public void setCast(String[] cast) {
        this.cast = cast;
    }

    public String[] getDirectors() {
        return directors;
    }

    public void setDirectors(String[] directors) {
        this.directors = directors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" +getId() + '\'' +
                ", title="+getTitle() + '\'' +
                ", releaseYear=" + releaseYear +
                ", cast=" + Arrays.toString(cast) +
                ", directors=" + Arrays.toString(directors) +
                ", genre='" + genre + '\'' +
                ", imdbRating=" + imdbRating +
                '}';
    }
}
