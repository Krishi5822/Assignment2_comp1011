package com.example.assignment2_comp1011;

import com.google.gson.annotations.SerializedName;

public class APIResponse {


    @SerializedName("data")
    private PlayerData[] data;

    @SerializedName("apikey")
    private String apikey;

    public PlayerData[] getData() {
        return data;
    }

    public String getApikey() {
        return apikey;
    }
}