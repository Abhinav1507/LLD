package Model;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;

import Repo.Restaurant_repo;

public class Restaurant {
    private String Name;
    private Integer ID;

    private static Integer lastID=0;
    private HashMap<String,Integer> Menu;

    private Queue<Order> Capacity;
    private Integer currentCapacity;
    private Integer totalCapacity;

    private static Restaurant_repo restaurantRepo = Restaurant_repo.getInstance();

    public Restaurant(String Name,Integer totalCapacity,HashMap<String,Integer> Menu){
        this.Menu=Menu;
        this.ID=lastID++;
        this.Name=Name;
        this.Capacity= new ArrayDeque<Order>(totalCapacity) ;
        this.totalCapacity=totalCapacity;
        this.currentCapacity=totalCapacity;
        //restaurantRepo.Save(this.Name,this.Menu);
    }

    public HashMap<String,Integer> getMenu(){
        return Menu;
    }

    public String getName(){
        return Name;
    }


        
}
