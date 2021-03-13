/*
 * @author Vipul Thakur
 * @email vipul01.thakur@gmail.com
 */

package com.insignia.webBookmark.service;

import com.insignia.webBookmark.dao.BookmarkDao;
import com.insignia.webBookmark.dao.UserDao;
import com.insignia.webBookmark.entities.*;

import java.util.ArrayList;
import java.util.Collection;

public class BookmarkService {

    private static final BookmarkService bookmarkService = new BookmarkService();
    private static final BookmarkDao bookmarkDao = new BookmarkDao();
    private final UserDao userDao = new UserDao();

    private BookmarkService() {
    }

    public static BookmarkService getInstance() {
        return bookmarkService;
    }

    public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast, String[] directors, String genre, double imdbRating) {
        Movie movie = new Movie();
        movie.setId(id);
        movie.setTitle(title);
        movie.setReleaseYear(releaseYear);
        movie.setCast(cast);
        movie.setDirectors(directors);
        movie.setGenre(genre);
        movie.setImdbRating(imdbRating);
        return movie;

    }

    public Book createBook(long id, String title, int publicationYear, String publisher, String[] authors, String genre, double amazonRating) {
        Book book = new Book();
        book.setId(id);
        book.setTitle(title);
        book.setPublicationYear(publicationYear);
        book.setPublisher(publisher);
        book.setAuthors(authors);
        book.setGenre(genre);
        book.setAmazonRating(amazonRating);
        return book;
    }

    public Weblink createWeblink(long id, String title, String url, String host) {
        Weblink weblink = new Weblink();
        weblink.setId(id);
        weblink.setTitle(title);
        weblink.setUrl(url);
        weblink.setHost(host);
        return weblink;
    }

    public Bookmark[][] getBookmarks(){
        return bookmarkDao.getBookmarks();
    }

    public void saveUserBookmark(User user, Bookmark bookmark) {
        UserBookmark userBookmark = new UserBookmark();
        userBookmark.setUser(user);
        userBookmark.setBookmark(bookmark);
        userDao.addUserBookmark(userBookmark);

    }

    public void setKidFriendly(String userType, String decision,Bookmark bookmark) {
            bookmark.setKidFriendlyStatus(decision);
            bookmark.setKidFriendlyMarkedBy(userType);
            System.out.println(bookmark.getId() + " kidFriendly decison is "+ decision);
    }

    public void share(String userType, Bookmark bookmark) {
        bookmark.setSharedBy(userType);
        if(bookmark instanceof Book)
            System.out.println(((Book)bookmark).getItemData());
        if (bookmark instanceof Weblink)
            System.out.println(((Weblink)bookmark).getItemData());
    }

    public Collection<Book> getMyBooks(){
        Collection<Book> myBooks = new ArrayList<>();

        Book book = new Book();
        book.setImageUrl("http://photo.goodreads.com/books/1170846378m/73968.jpg");
        book.setAuthors(new String[]{"Erich Segal"});
        book.setAmazonRating(3.44);

        myBooks.add(book);

        book = new Book();
        book.setImageUrl("http://ecx.images-amazon.com/images/I/21WBe6pNO5L._SX106_.jpg");
        book.setAuthors(new String[]{"Lillian Eichler Watson"});
        book.setAmazonRating(5.0);

        myBooks.add(book);

        return myBooks;
    }
}
