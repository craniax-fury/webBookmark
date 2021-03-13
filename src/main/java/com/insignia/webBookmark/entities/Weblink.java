/*
 * @author Vipul Thakur
 * @email vipul01.thakur@gmail.com
 */

package com.insignia.webBookmark.entities;


import com.insignia.webBookmark.partner.Shareable;

public class Weblink extends Bookmark implements Shareable {

    private String url;
    private String host;

    @Override
    public boolean isKidFriendlyEligible() {
        if (getUrl().contains("porn") || getTitle().contains("porn") || getHost().contains("adult"))
            return false;
        return !getUrl().contains("adult") || !getHost().contains("adult");
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public String toString() {
        return "Weblink{" +
                "id=" + getId() + '\'' +
                ", title=" + getTitle() + '\'' +
                ", url='" + url + '\'' +
                ", host='" + host + '\'' +
                '}';
    }

    public String getItemData() {
        StringBuilder builder = new StringBuilder();
        builder.append("<item>");
        builder.append("<type>Weblink</type>");

        builder.append("<title>").append(getTitle()).append("</title>");
        builder.append("<url>").append(url).append("</url>");
        builder.append("<host>").append(host).append("</host>");
        builder.append("</item>");
        return String.valueOf(builder);
    }
}
