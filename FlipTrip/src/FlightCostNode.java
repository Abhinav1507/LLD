import java.util.Comparator;

public class FlightCostNode {

    public String AirlineName;
    public String SourceCity;
    public String DestinationCity;
    public int Price;
    public int hop;

    public FlightCostNode(){
        
    }

    public FlightCostNode(String SourceCity,String DestinationCity,String AirlineName,int Price,int hop ){
        this.SourceCity=SourceCity;
        this.DestinationCity=DestinationCity;
        this.AirlineName=AirlineName;
        this.Price=Price;
        this.hop=hop;
    }

    public static class PriceComparator implements Comparator<FlightCostNode>{
        @Override
        public int compare(FlightCostNode o1, FlightCostNode o2) {
            if (o1.Price != o2.Price) {
                return Integer.compare(o1.Price,o2.Price);
            }
            return Integer.compare(o1.hop, o2.hop);
            //throw new UnsupportedOperationException("Unimplemented method 'compare'");
        }
    }
    
}
