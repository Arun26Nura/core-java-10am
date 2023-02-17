package com.besant.core.collections;

public class City {
    private String name;
    private boolean metro;
    private int code;

    public City(String name, boolean metro, int code) {
        this.name = name;
        this.metro = metro;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public boolean isMetro() {
        return metro;
    }

    public int getCode() {
        return code;
    }
}
