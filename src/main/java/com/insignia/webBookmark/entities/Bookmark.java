/*
 * @author Vipul Thakur
 * @email vipul01.thakur@gmail.com
 */

package com.insignia.webBookmark.entities;

import com.insignia.webBookmark.constants.KidFriendlyStatus;

public abstract class Bookmark {
    private long id;
    private String title;
    private String profileUrl;
    private String kidFriendlyStatus = KidFriendlyStatus.UNKNOWN;
    private String kidFriendlyMarkedBy;
    private String sharedBy;

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract boolean isKidFriendlyEligible();


    public String getKidFriendlyStatus() {
        return kidFriendlyStatus;
    }

    public void setKidFriendlyStatus(String kidFriendlyStatus) {
        this.kidFriendlyStatus = kidFriendlyStatus;
    }

    public String getKidFriendlyMarkedBy() {
        return kidFriendlyMarkedBy;
    }

    public void setKidFriendlyMarkedBy(String userType) {
        this.kidFriendlyMarkedBy=userType;
    }

    public void setSharedBy(String userType){
        this.sharedBy=userType;
    }

    public String getSharedBy() {
        return sharedBy;
    }
}
