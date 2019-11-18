package com.example.android.shushme;

public class MyPlace {
    private String id, name, address;

    public MyPlace(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public MyPlace() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
