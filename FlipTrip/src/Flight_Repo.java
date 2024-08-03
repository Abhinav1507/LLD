import java.util.PriorityQueue;

public class Flight_Repo {

    private PriorityQueue<Flight> pq = new PriorityQueue<>();

    public void save(Flight flight){
        this.pq.add(flight);
    }

    public String search(String SourceCity,String DestinationCity){



        return "and";
    }
    //HashMap<String,HashMap<String,Integer>> ll = new HashMap<>();
    //pub
    /*public void save(String AirlineName,String SourceCity,String DestinationCity,int Price){
        if(this.ll.containsKey(SourceCity)==false){
            HashMap<String,HashMap<String,Integer>> kk=ll.get(SourceCity);
            if(kk.containsKey(DestinationCity)){
                HashMap<String,Integer> av_air = kk.get(DestinationCity);
                av_air.put(AirlineName,Price);
                kk.put(DestinationCity, av_air);
                return;
            }
            HashMap<String,Integer> pp = new HashMap<>();
            pp.put(AirlineName, Price);
            kk.put(DestinationCity,pp);
            this.ll.put(SourceCity,kk);
        }
        else{
            HashMap<String,HashMap<String,Integer>> kk = new HashMap<>();
            HashMap<String,Integer> pp = new HashMap<>();
            pp.put(AirlineName, Price);
            kk.put(DestinationCity,pp);
            this.ll.put(SourceCity,kk);
        }
        
    }*/
} 
