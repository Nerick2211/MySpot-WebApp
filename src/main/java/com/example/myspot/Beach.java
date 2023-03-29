package com.example.myspot;

import java.util.Map;

public class Beach {

    private int id;
    private String name;
    private String location;
    private Map<String, Float> rating;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Map<String, Float> getRating() {
        return rating;
    }
}

