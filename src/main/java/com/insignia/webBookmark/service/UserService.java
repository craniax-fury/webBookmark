/*
 * @author Vipul Thakur
 * @email vipul01.thakur@gmail.com
 */
package com.insignia.webBookmark.service;

import com.insignia.webBookmark.dao.UserDao;
import com.insignia.webBookmark.entities.User;
import com.insignia.webBookmark.entities.UserBookmark;

public class UserService {
    private static final UserService userService = new UserService();
    private static final UserDao userDao = new UserDao();

    private UserService() {
    }

    public static UserService getInstance() {
        return userService;
    }

    public User createUser(long id, String email, String password, String firstName, String lastName, int gender, String userType) {
        User user = new User();
        user.setId(id);
        user.setEmail(email);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setGender(gender);
        user.setUserType(userType);
        return user;
    }

    public User[] getUsers(){
        return userDao.getUsers();
    }

    public UserBookmark[] getUserBookmarks() {
        return userDao.getUserBookmarks();
    }
}
