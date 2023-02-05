package com.example.Test02.service;

import com.example.Test02.model.Restaurant;

import java.util.ArrayList;


public class RestaurantService {
    static ArrayList<Restaurant> RestaurantList = new ArrayList<>();
//    static{
//        Restaurant res = new Restaurant("Sarthak Rastaurant","Near Pune Nagar Road",
//                "8459281670","Veg Maratha",10,"Indian",4);
//        RestaurantList.add(res);
//    }

    public static ArrayList<Restaurant> getAllRestaurant() {

        return RestaurantList;
    }

    public static String addRestaurant(Restaurant restaurant) {
        RestaurantList.add(restaurant);
        return "Successful";
    }

    public static  ArrayList<Restaurant>  getRestaurant(String restaurantName) {
        ArrayList<Restaurant> restaurantList = new ArrayList<>();
        Restaurant res = null;
        for (int i = 0; i < RestaurantList.size(); i++) {
            res = RestaurantList.get(i);
            if (res.getRestaurantName().equals(restaurantName)) {
                restaurantList.add(res);
                return restaurantList;
            }
//        }return RestaurantList;
        }
        restaurantList.add(res);
        return restaurantList;
    }
}
