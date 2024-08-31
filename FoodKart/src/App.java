import java.util.HashMap;

import Model.Registration;
import Selection.MinCostRestaurant;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Registration registration = new Registration();
        //registration.save("resta1", {"king_burger": 10, "samosa_pizza": 20, "alu_pasta": 19}, 15);
        HashMap<String,Integer> menu = new HashMap<>();
        menu.put("king_burger", 10);
        menu.put("samosa_pizza", 20);
        menu.put("alu_pasta", 19);
        registration.save("resta1", menu, 15);
        HashMap<String,Integer> menu1 = new HashMap<>();
        menu1.put("bendi_macaroni", 12);
        menu1.put("samosa_pizza", 25);
        menu1.put("alu_pasta", 17);
        registration.save("resta2", menu1, 12);
        System.out.println(registration.all_restaurant_details());
        HashMap<String,Integer> menu2 = new HashMap<>();
        menu2.put("bendi_macaroni", 8);
        menu2.put("king_burger", 15);
        registration.menu_update("resta1", menu2);
        System.out.println(registration.all_restaurant_details());
        MinCostRestaurant minCostRestaurant = new MinCostRestaurant();
        System.out.println(minCostRestaurant.RestaurantSearch("alu_pasta"));
    }
}
