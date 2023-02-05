package com.example.Test02.controller;

import com.example.Test02.model.Restaurant;
import com.example.Test02.service.RestaurantService;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import static com.example.Test02.service.RestaurantService.getRestaurant;


@RestController
@RequestMapping("restaurant")
public class Restaurant_Controller {

    public  RestaurantService restaurantService;
//    public Restaurant_Controller(RestaurantService restaurantService) {
//        this.restaurantService=restaurantService;
//    }
    @GetMapping("/show_all")
    public ArrayList<Restaurant> getAll(){
        return RestaurantService.getAllRestaurant();
    }

  @PostMapping("/add-restaurant")
  public String addRastaurant(@RequestBody Restaurant restaurant) {
      return RestaurantService.addRestaurant(restaurant);
  }


  //http://localhost:8080/restaurant/getRestaurantInfo/restaurantName/"Navya Rastaurant"?restaurantName=Navya Rastaurant
  @GetMapping("/getRestaurantInfo/restaurantName/{restaurantName}")
    public  ArrayList<Restaurant>  getRestaurantInfo(@PathVariable String restaurantName){
        return getRestaurant(restaurantName);
  }
}
