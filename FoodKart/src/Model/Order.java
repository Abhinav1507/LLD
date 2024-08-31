package Model;

import java.util.HashMap;

import Repo.Restaurant_repo;

public class Order {
    public String Name;
    public HashMap<String,Integer> bucket;
    public Boolean delevired;

    private static Restaurant_repo restaurantRepo = Restaurant_repo.getInstance();

    private Order(String name,HashMap<String,Integer>  bucket){
        this.Name=name;
        this.bucket=bucket;
        this.delevired=false;
    }

    public Order bookorder(String name,HashMap<String,Integer> orderbucket){
        Order order = new Order(name, orderbucket);
        return order;
    }
}
