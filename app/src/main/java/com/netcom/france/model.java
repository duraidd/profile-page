package com.netcom.france;

public class model {
 private String about;
 private int logo;

    public model(String about, int logo) {
        this.about = about;
        this.logo = logo;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}


