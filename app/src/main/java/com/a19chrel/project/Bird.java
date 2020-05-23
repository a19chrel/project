package com.a19chrel.project;

public class Bird {

    private String id;
    private String name;
    private int quantity;
    private String category;
    private String pictureUrl;

    public Bird(){
        id = "unknown";
        name = "unknown";
        quantity = 0;
        category = "unknown";
        pictureUrl = "https://via.placeholder.com/150.jpg";
    }

    public Bird(String id, String name, int quantity, String category, String pictureUrl){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.category = category;
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


    public String getPictureUrl(){
        return pictureUrl;
    }

}