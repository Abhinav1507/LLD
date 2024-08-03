import java.util.HashMap;

public interface FeatureStrategy {
    public int find(HashMap<String,HashMap<String,HashMap<String,Integer>>> db , String SourceCity , String DestinationCity);
}
