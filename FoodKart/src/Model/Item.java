package Model;



public class Item {
    public String Name;
    public String minCostRestaurant;
    public Integer minCost;

    public Item(String name, String minCostRestaurant , Integer minCost){
        this.Name=name;
        this.minCostRestaurant=minCostRestaurant;
        this.minCost=minCost;
    }

    public void set_minCost(Integer newCost,String restaurantName){
        if(minCost>newCost){
            minCost=newCost;
            minCostRestaurant=restaurantName;
        }
    };
}
