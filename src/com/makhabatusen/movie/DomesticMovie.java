package com.makhabatusen.movie;

public class DomesticMovie implements  Movie{
    private String name;

    public DomesticMovie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getDuration(int duration) {
        return duration;
    }
}
