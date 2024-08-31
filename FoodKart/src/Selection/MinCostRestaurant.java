package Selection;

import java.util.HashMap;

import Model.Item;
import Repo.Restaurant_repo;

public class MinCostRestaurant implements RestaurantSelection {

    private static Restaurant_repo restaurantRepo = Restaurant_repo.getInstance();

    public MinCostRestaurant(){
        
    }

    @Override
    public HashMap<String,Integer> RestaurantSearch(String item) {
        // TODO Auto-generated method stub
        Item requiredItem = restaurantRepo.getItem(item);
        HashMap<String,Integer> order = new HashMap<String,Integer>();
        order.put(requiredItem.minCostRestaurant, requiredItem.minCost);
        return order;
    }
    
}
