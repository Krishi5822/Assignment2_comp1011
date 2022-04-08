package com.example.assignment2_comp1011;

import com.google.gson.annotations.SerializedName;

public class PlayerData {
    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("country")
    private String country;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String toString()
    {
        return String.format("%s, (%s)", name, country);
    }
}
