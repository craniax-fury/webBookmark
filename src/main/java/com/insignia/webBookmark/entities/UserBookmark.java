/*
 * @author Vipul Thakur
 * @email vipul01.thakur@gmail.com
 */

package com.insignia.webBookmark.entities;

public class UserBookmark {

    private User user;
    private Bookmark bookmark;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bookmark getBookmark() {
        return bookmark;
    }

    public void setBookmark(Bookmark bookmark) {
        this.bookmark = bookmark;
    }

    @Override
    public String toString() {
        return "UserBookmark{" +
                "user=" + user.getEmail() +
                ", bookmark=" + bookmark.getId() +
                '}';
    }
}
