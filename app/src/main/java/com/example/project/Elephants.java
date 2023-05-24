package com.example.project;

import com.google.gson.annotations.SerializedName;

public class Elephants {
    @SerializedName("ID")
    private String id;
    @SerializedName("company")
    private String weight;
    @SerializedName("name")
    private String name;
    @SerializedName("category")
    private String height;
    @SerializedName("auxdata")
    private String info;

    public Elephants(String id, String info, String weight, String name, String height) {
        this.id = id;
        this.info = info;
        this.weight = weight;
        this.name = name;
        this.height = height;
    }

    public String getElephants() {
        return "Species: " + id +
                "\nName: " + name +
                "\nWeight: " + weight +
                "\nheight: " + height +
                "\ninfo: " + info;
    }

}
