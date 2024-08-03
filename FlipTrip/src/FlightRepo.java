//import java.util.LinkedList;
import java.util.HashMap;
//import java.util.HashSet;

public class FlightRepo {

    private static FlightRepo instance;
    //LinkedList<String> ll = new LinkedList<String>();
    // d-n adjmat souc dest arn price 
    private HashMap<String,HashMap<String,HashMap<String,Integer>>> ll;
    FlightMinCost minCost= new FlightMinCost();
    //private HashMap<String,HashMap<
    private FlightRepo(){
        this.ll=new HashMap<>();
    }

    public static synchronized FlightRepo getInstance(){
        if(instance==null){
            instance=new FlightRepo();
        }
        return instance;
    }
    

    public void save(String AirlineName,String SourceCity,String DestinationCity,int Price){
        if(ll.containsKey(SourceCity)==false){
            HashMap<String,HashMap<String,Integer>> kk = new HashMap<>();
            ll.put(SourceCity, kk);
        }
        HashMap<String,HashMap<String,Integer>> kk = ll.get(SourceCity);
        if(kk.containsKey(DestinationCity)==false){
            HashMap<String,Integer> pos_air = new HashMap<String,Integer>();
            kk.put(DestinationCity, pos_air);
        }
        HashMap<String,Integer> pos_air = kk.get(DestinationCity);
        if(pos_air.containsKey(AirlineName)==false){
            pos_air.put(AirlineName,Price);
        }
        else{
            return;
        }
        
        
    }

    public int Search(String SourceCity,String DestinationCity){
        if(ll.containsKey(SourceCity)==false){
            return -1;
        }
        int pr =minCost.find(ll, SourceCity, DestinationCity);
        return pr;

    }

    public HashMap<String,HashMap<String,HashMap<String,Integer>>> show(){
        return ll;
    }


}
