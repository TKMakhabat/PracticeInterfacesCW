package com.makhabatusen.edition;

abstract class Book implements Edition{
    private String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
