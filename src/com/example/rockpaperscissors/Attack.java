package com.example.rockpaperscissors;

/**
 * Created by Geir on 10/31/2015.
 */
public class Attack {

    private String weapon = "generic";
    private String winsOver = "all";

    public String getWeapon() {
        return weapon;
    }

    void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWinsOver() {
        return winsOver;
    }

    void setWinsOver(String winsOver) {
        this.winsOver = winsOver;
    }

}

