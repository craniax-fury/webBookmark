/*
 * @author Vipul Thakur
 * @email vipul01.thakur@gmail.com
 */

package com.insignia.webBookmark.dao;


import com.insignia.webBookmark.DataStore;
import com.insignia.webBookmark.entities.User;
import com.insignia.webBookmark.entities.UserBookmark;

public class UserDao {

    public User[] getUsers(){
        return DataStore.getUsers();
    }

    public void addUserBookmark(UserBookmark userBookmark) {
        DataStore.addUserBookMark(userBookmark);
    }

    public UserBookmark[] getUserBookmarks() {
       return DataStore.getUserBookMarks();
    }
}
