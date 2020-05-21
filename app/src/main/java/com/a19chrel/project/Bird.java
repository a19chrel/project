package com.a19chrel.project;

public class Bird {

    private String id;
    private String name;
    private int quantity;
    private String category;
    private String location;
    private String pictureUrl;

    public Bird(){
        id = "unknown";
        name = "unknown";
        quantity = 0;
        category = "unknown";
        location = "unknown";
        pictureUrl = "https://via.placeholder.com/150.jpg";
    }

    public Bird(String id, String name, int quantity, String category, String location, String pictureUrl){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.category = category;
        this.location = location;
        this.pictureUrl = pictureUrl;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getCategory(){
        return category;
    }

    public String getLocation(){
        return location;
    }

    public String getPictureUrl(){
        return pictureUrl;
    }

}