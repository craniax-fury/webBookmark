/*
 * @author Vipul Thakur
 * @email vipul01.thakur@gmail.com
 */

package com.insignia.webBookmark.entities;

import com.insignia.webBookmark.constants.BookGenre;
import com.insignia.webBookmark.partner.Shareable;

import java.util.Arrays;

public class Book extends Bookmark implements Shareable {
    private int publicationYear;
    private String publisher;
    private String[] authors;
    private String genre;
    private double amazonRating;
    private String imageUrl;

    @Override
    public boolean isKidFriendlyEligible() {
        return !getGenre().equals(BookGenre.PHILOSOPHY) && !getGenre().equals(BookGenre.SELF_HELP);
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getAmazonRating() {
        return amazonRating;
    }

    public void setAmazonRating(double amazonRating) {
        this.amazonRating = amazonRating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + getId() + '\'' +
                ", title=" + getTitle() + '\'' +
                ", publicationYear=" + publicationYear +
                ", publisher='" + publisher + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", genre='" + genre + '\'' +
                ", amazonRating=" + amazonRating +
                '}';
    }

    public String getItemData() {
        StringBuilder builder = new StringBuilder();
        StringBuilder authorList = new StringBuilder();
        for(String author:authors){
            authorList.append(author);
        }
        builder.append("<item>");
        builder.append("<type>Book</type>");

        builder.append("<title>").append(getTitle()).append("</title>");
        builder.append("<authors>").append(authorList).append("</authors>");
        builder.append("publishers").append(publisher).append("</publishers>");
        builder.append("publicationYear").append(publicationYear).append("publicationYear");
        builder.append("genre").append(genre).append("</genre>");
        builder.append("amazonRating").append(amazonRating).append("</amazonRating>");
        builder.append("</item>");
        return String.valueOf(builder);
    }

}
