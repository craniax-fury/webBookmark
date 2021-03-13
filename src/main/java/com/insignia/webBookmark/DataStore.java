/*
 * @author Vipul Thakur
 * @email vipul01.thakur@gmail.com
 */

package com.insignia.webBookmark;


import com.insignia.webBookmark.constants.BookGenre;
import com.insignia.webBookmark.constants.Gender;
import com.insignia.webBookmark.constants.MovieGenre;
import com.insignia.webBookmark.constants.UserType;
import com.insignia.webBookmark.entities.User;
import com.insignia.webBookmark.entities.UserBookmark;
import com.insignia.webBookmark.service.BookmarkService;
import com.insignia.webBookmark.service.UserService;
import com.insignia.webBookmark.entities.Bookmark;

public class DataStore {
   public static final int TOTAL_USER_COUNT = 5;

   private static final User[] users = new User[TOTAL_USER_COUNT];
   public static final int BOOKMARK_TYPES_COUNT = 3;
   public static final int BOOKMARK_COUNT_PER_TYPE = 5;
   private static final Bookmark[][] bookmarks = new Bookmark[BOOKMARK_TYPES_COUNT][BOOKMARK_COUNT_PER_TYPE];
   public static final int USER_BOOKMARK_LIMIT = 5;
   private static final UserBookmark[] userBookmarks = new UserBookmark[TOTAL_USER_COUNT * USER_BOOKMARK_LIMIT];
   private static int bookmarkIndex;

   public static User[] getUsers() {
       return users;
   }

   public static Bookmark[][] getBookmarks() {
       return bookmarks;
   }

   public static void loadData() {
       loadUsers();
       loadMovies();
       loadBooks();
       loadWebLinks();
   }

   private static void loadUsers() {
       users[0] = UserService.getInstance().createUser(1000, "user0@insignia.com", "test", "John", "M", Gender.MALE, UserType.USER);
       users[1] = UserService.getInstance().createUser(1001, "user1@insignia.com", "test", "Sam", "M", Gender.MALE, UserType.EDITOR);
       users[2] = UserService.getInstance().createUser(1002, "user2@insignia.com", "test", "Anita", "M", Gender.MALE, UserType.EDITOR);
       users[3] = UserService.getInstance().createUser(1003, "user3@insignia.com", "test", "Sara", "M", Gender.FEMALE, UserType.EDITOR);
       users[4] = UserService.getInstance().createUser(1004, "user4@insignia.com", "test", "Dheeru", "M", Gender.MALE, UserType.CHIEF_EDITOR);
   }

   private static void loadMovies() {
       bookmarks[1][0] = BookmarkService.getInstance().createMovie(3000, "Citizen Kane", "",1941, new String[]{"Orson Welles,Joseph Cotten"}, new String[]{"Orson Welles"}, MovieGenre.CLASSICS, 8.5);
       bookmarks[1][1] = BookmarkService.getInstance().createMovie(3001, "The Grapes of Wrath", "",1940, new String[]{"Henry Fonda,Jane Darwell"}, new String[]{"John Ford"}, MovieGenre.CLASSICS, 8.2);
       bookmarks[1][2] = BookmarkService.getInstance().createMovie(3002, "A Touch of Greatness", "",2004, new String[]{"Albert Cullum"}, new String[]{"Leslie Sullivan"}, MovieGenre.DOCUMENTARIES, 7.3);
       bookmarks[1][3] = BookmarkService.getInstance().createMovie(3003, "The Big Bang Theory", "",2007, new String[]{"Kaley Cuoco,Jim Parsons,Chuck Lorre,Bill Prady"}, new String[]{"Chuck Lorre,Bill Prady"}, MovieGenre.TV_SHOWS, 8.7);
       bookmarks[1][4] = BookmarkService.getInstance().createMovie(3004, "Ikiru","", 1952, new String[]{"Takashi Shimura,Minoru Chiaki"}, new String[]{"Akira Kurosawa"}, MovieGenre.FOREIGN_MOVIES, 8.4);
   }

   private static void loadBooks() {
       bookmarks[2][0] = BookmarkService.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications", new String[]{"Henry David Thoreau"}, BookGenre.PHILOSOPHY, 4.3);
       bookmarks[2][1] = BookmarkService.getInstance().createBook(4001, "Self-Reliance and Other Essays", 1993, "Dover Publications", new String[]{"Ralph Waldo Emerson"}, BookGenre.PHILOSOPHY, 4.5);
       bookmarks[2][2] = BookmarkService.getInstance().createBook(4002, "Light From Many Lamps", 1988, "Touchstone", new String[]{"Lillian Eichler Watson"}, BookGenre.PHILOSOPHY, 5.0);
       bookmarks[2][3] = BookmarkService.getInstance().createBook(4003, "Head First Design Patterns", 2004, "O'Reilly Media", new String[]{"Eric Freeman,Bert Bates,Kathy Sierra,Elisabeth Robson"}, BookGenre.TECHNICAL, 5.0);
       bookmarks[2][4] = BookmarkService.getInstance().createBook(4004, "Effective Java Programming Language Guide", 2007, "Prentice Hall", new String[]{"Joshua Bloch"}, BookGenre.TECHNICAL, 4.9);

   }

   private static void loadWebLinks() {
       bookmarks[0][0] = BookmarkService.getInstance().createWeblink(2000, "How do I import a pre-existing Java project into Eclipse and get up and running?", "http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-porn-eclipse-and-get-up-and-running", "http://www.stackoverflow.com");;
       bookmarks[0][1] = BookmarkService.getInstance().createWeblink(2001, "How do I import a pre-existing Java project into Eclipse and get up and running?", "http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-into-eclipse-and-get-up-and-running", "http://www.stackoverflow.com");
       bookmarks[0][2] = BookmarkService.getInstance().createWeblink(2002, "Interface vs Abstract Class", "http://mindprod.com/jgloss/interfacevsabstract.html", "http://mindprod.com");
       bookmarks[0][3] = BookmarkService.getInstance().createWeblink(2003, "NIO tutorial by Greg Travis", "http://cs.brown.edu/courses/cs161/papers/j-nio-ltr.pdf", "http://cs.brown.edu");
       bookmarks[0][4] = BookmarkService.getInstance().createWeblink(2004, "Virtual Hosting and Tomcat", "http://tomcat.apache.org/tomcat-6.0-doc/virtual-hosting-howto.html", "http://tomcat.apache.org");
   }

   public static void addUserBookMark(UserBookmark userBookmark){
       userBookmarks[bookmarkIndex] = userBookmark;
       bookmarkIndex++;
   }

   public static UserBookmark[] getUserBookMarks() {
       return userBookmarks;
   }
}
