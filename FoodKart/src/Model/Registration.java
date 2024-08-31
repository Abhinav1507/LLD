package Model;

import java.util.HashMap;

import Repo.Restaurant_repo;

public class Registration {
    private static Restaurant_repo restaurantRepo = Restaurant_repo.getInstance();
    public Registration( ){
    }

    public void save(String Name,HashMap<String,Integer> Menu,Integer totalCapacity){
        Restaurant restaurant = new Restaurant(Name,totalCapacity,Menu);
        restaurantRepo.Save(Name, restaurant);
    }

    public void menu_update(String Name,HashMap<String,Integer> Menu){
        restaurantRepo.update(Name,Menu);
    }

    public HashMap<String,HashMap<String,Integer>> all_restaurant_details(){
        return restaurantRepo.getallMenu();
    }
}
