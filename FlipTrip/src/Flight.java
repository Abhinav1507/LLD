import java.util.HashMap;

public class Flight {
    private String AirlineName;
    private String SourceCity;
    private String DestinationCity;
    private int Price;
    private  static FlightRepo flightRepo = FlightRepo.getInstance();
    

    
    
    public String RegisterFlight(String AirlineName,String SourceCity,String DestinationCity,int Price ){
        if(AirlineName.length()<2){
            return "AirlineName is invalid";
        }
        this.AirlineName=AirlineName;
        this.SourceCity=SourceCity;
        this.DestinationCity=DestinationCity;
        this.Price=Price;
        flightRepo.save(this.AirlineName, this.SourceCity, this.DestinationCity, this.Price);
        return "Flight Registered";

    }

    public HashMap<String,HashMap<String,HashMap<String,Integer>>> totalFlights(){
        return flightRepo.show();
    }

    public String FindLowestCostFlight(String SourceCity,String DestinationCity){
        int pt = flightRepo.Search(SourceCity,DestinationCity);
        //System.out.println(pt);
        return SourceCity+" "+String.valueOf(pt)+" "+DestinationCity;
    }

    
}