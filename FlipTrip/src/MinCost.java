import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;

public class MinCost implements FeatureStrategy {


    @Override
    public int find(HashMap<String,HashMap<String,HashMap<String,Integer>>> db , String SourceCity , String DestinationCity) {
        // TODO Auto-generated method stub
        PriorityQueue<LinkedHashSet<Integer>> pq = new PriorityQueue<>();
        HashMap<String,Integer> totalCities = new HashMap<>();
        HashMap<String,Integer> totalAirline = new HashMap<>();
        int c =0;
        int a =1;
        totalCities.put(SourceCity, c);
        //totalCities.put();
        HashMap<String,HashMap<String,Integer>> nextdest = db.get(SourceCity);
        for(String i:nextdest.keySet()){
            if(totalCities.containsKey(i)==false){
                c++;
                totalCities.put(i, c);
            }
            for(String j:nextdest.get(i).keySet()){
                if(totalAirline.containsKey(j)==false){
                    totalAirline.put(j, a);
                    a++;
                }
                LinkedHashSet<Integer> st = new LinkedHashSet<>(4);
                int price = nextdest.get(i).get(j);
                st.add(1);
                st.add(totalCities.get(i));
                st.add(totalAirline.get(j));
                pq.add(st);

            }
        }
        while(pq.isEmpty()==false){
            LinkedHashSet<Integer> top = pq.poll();
            top.iterator();

        }
        HashMap<String,Integer> possFlight = nextdest.get(DestinationCity);
        


        
        return 0;

        //throw new UnsupportedOperationException("Unimplemented method 'findFeature'");
    }
    
}
