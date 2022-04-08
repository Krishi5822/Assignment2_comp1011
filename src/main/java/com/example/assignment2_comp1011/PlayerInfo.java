package com.example.assignment2_comp1011;

import com.google.gson.annotations.SerializedName;

public class PlayerInfo {

    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("dateOfBirth")
    private String dateOfBirth;

    @SerializedName("role")
    private String role;

    @SerializedName("battingStyle")
    private String battingStyle;

    @SerializedName("bowlingStyle")
    private String bowlingStyle;

    @SerializedName("placeOfBirth")
    private String placeOfBirth;

    @SerializedName("playerImg")
    private String playerImg;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getRole() {
        return role;
    }

    public String getBattingStyle() {
        return battingStyle;
    }

    public String getBowlingStyle() {
        return bowlingStyle;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public String getPlayerImg() {
        return playerImg;
    }

    //    public String toString()
//    {
//        return String.format(name);
//    }
}
