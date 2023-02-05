package com.example.Test02.model;

public class Restaurant {
    private String restaurantName;
    private String address;
    private String number;
    private String speciality;
    private int totalStaff;

    public Restaurant(String restaurantName, String address, String number, String speciality, int totalStaff, String cusinTypes, int rating) {
        this.restaurantName = restaurantName;
        this.address = address;
        this.number = number;
        this.speciality = speciality;
        this.totalStaff = totalStaff;
        this.cusinTypes = cusinTypes;
        this.rating = rating;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }

    public String getCusinTypes() {
        return cusinTypes;
    }

    public void setCusinTypes(String cusinTypes) {
        this.cusinTypes = cusinTypes;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    private String cusinTypes;
    private int rating;

}
