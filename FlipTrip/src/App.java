public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Flight ft = new Flight();
        ft.RegisterFlight("JetAir", "DEL", "BLR", 500);
        Flight ft1 = new Flight();
        ft1.RegisterFlight("JetAir", "BLR", "LON", 2000);
        Flight ft2 = new Flight();
        ft2.RegisterFlight("Indigo", "BLR", "LON", 1000);
        Flight ft3 = new Flight();
        ft3.RegisterFlight("BtA", "LON", "NYC", 1500);
        Flight ft4 = new Flight();
        ft4.RegisterFlight("Indigo", "DEL", "LON", 15000);
        Flight ft5 = new Flight();
        ft5.RegisterFlight("Indigo", "BLR", "Paris", 5000);
        Flight ft6 = new Flight();
        ft6.RegisterFlight("FrAir", "Paris", "NYC", 500);
        Flight ft7 = new Flight();
        ft7.RegisterFlight("JetAir", "BLR", "Paris", 1000);

        System.out.println(ft1.totalFlights());
        System.out.println(ft1.FindLowestCostFlight("DEL", "NYC"));
        
        System.out.println(Integer.compare(500,1500));

    }
}
