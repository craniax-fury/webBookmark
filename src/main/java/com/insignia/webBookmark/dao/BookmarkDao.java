/*
 * @author Vipul Thakur
 * @email vipul01.thakur@gmail.com
 */

package com.insignia.webBookmark.dao;


import com.insignia.webBookmark.DataStore;
import com.insignia.webBookmark.entities.Bookmark;

public class BookmarkDao {

    public Bookmark[][] getBookmarks(){
        return DataStore.getBookmarks();
    }
}
