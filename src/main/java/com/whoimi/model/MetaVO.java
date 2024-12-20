package com.whoimi.model;

import java.io.Serializable;

/**
 *
 * @author whoimi
 */
public class MetaVO implements Serializable {

    private String title;

    private String icon;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public MetaVO(String title, String icon) {
        this.title = title;
        this.icon = icon;
    }
}