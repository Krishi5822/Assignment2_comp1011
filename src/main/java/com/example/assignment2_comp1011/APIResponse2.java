package com.example.assignment2_comp1011;

import com.google.gson.annotations.SerializedName;

public class APIResponse2 {

    @SerializedName("data")
    private PlayerInfo data;

    public PlayerInfo getData() {
        return data;
    }
}
