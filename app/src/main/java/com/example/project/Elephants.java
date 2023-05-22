package com.example.project;

public class Elephants {

    private double maximumWeight;
    private double averageWeight;

    private String name;

    public Elephants(String name, String location, int height) {
        this.name = name;
        this.maximumWeight = maximumWeight;
        this.averageWeight = averageWeight;
    }
    @Override
    public String toString() {
        return "Name: '" + name + '\'' +
                ", maximumWeight '" + maximumWeight + '\'' +
                ", averageWeight " + averageWeight;
    }
}
