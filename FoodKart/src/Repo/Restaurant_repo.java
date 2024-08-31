package Repo;

import java.util.HashMap;
import java.util.HashSet;

import Model.Item;
import Model.Restaurant;

public class  Restaurant_repo{
    private static Restaurant_repo instance;
    private static HashMap<String,Restaurant> repo;
    private static HashMap<String,Item> itemRepo;
    private static HashMap<String,HashMap<String,Integer>> allMenu;

    private Restaurant_repo(){
        repo= new HashMap<String,Restaurant>();
        itemRepo = new HashMap<String,Item>();
        allMenu = new HashMap<String,HashMap<String,Integer>>();
    }

    public static Restaurant_repo getInstance(){
        if(instance==null){
            instance = new Restaurant_repo();
            //instance.repo= new HashMap<String,HashMap<String,Integer>>();
        }

        return instance;
    }


    public void Save(String name,Restaurant restaurant){
        if(repo.containsKey(name)==false){
            repo.put(name,restaurant);
            allMenu.put(name, restaurant.getMenu());
            itemRestaurantSave(restaurant);
            System.out.println("This Restaurant has been saved");
        }
        else{
            System.out.println("This Restaurant is already present");
        }
        return;
    }

    public void update(String name,HashMap<String,Integer> menu){
        if(repo.containsKey(name)==false){
            System.out.println("This Restaurant is not present");
            return;
        }
        //HashMap<String,Integer> Current_Menu=repo.get(name);
        for(String item:menu.keySet()){
            repo.get(name).getMenu().put(item, menu.get(item));
            allMenu.get(name).put(item, menu.get(item));
            itemRepo.get(item).set_minCost(menu.get(item),name);
        }
        System.out.println("Menu is now updated");
        return;
    }

    public void itemRestaurantSave(Restaurant restaurant){
        HashMap<String,Integer> menu = restaurant.getMenu();
        String restaurantName = restaurant.getName();
        for(String name:menu.keySet()){
            if(itemRepo.containsKey(name)){
                Item item = itemRepo.get(name);
                item.set_minCost(menu.get(name),restaurantName);
                itemRepo.put(name, item);
            }
            else{
                Item item = new Item(name,restaurant.getName(),menu.get(name));
                itemRepo.put(name, item);
            }

        }
    }


    public Item getItem(String name){
        return itemRepo.get(name);
    }

    public HashMap<String,HashMap<String,Integer>> getallMenu(){
        
        return allMenu;
    }
}
