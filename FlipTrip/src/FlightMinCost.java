import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class FlightMinCost implements FeatureStrategy {
    PriorityQueue<FlightCostNode> pq = new PriorityQueue<>(new FlightCostNode.PriceComparator());
    @Override
    public int find(HashMap<String, HashMap<String, HashMap<String, Integer>>> db, String SourceCity,
            String DestinationCity) {
        
        FlightCostNode fn = new FlightCostNode();
        int Result = Integer.MAX_VALUE;
        //db.get(SourceCity).
        // TODO Auto-generated method stu
        HashMap<FlightCostNode,Integer> visited = new HashMap<>();
        HashSet<String> visitedCities = new HashSet<>();
        fn.SourceCity=SourceCity;
        fn.DestinationCity=SourceCity;
        fn.Price=0;
        fn.hop=0;
        pq.add(fn);
        while(pq.isEmpty()==false){
            FlightCostNode cur = pq.poll();
            if(visited.containsKey(cur)){

                continue;
            }
            visitedCities.add(cur.SourceCity);
            //System.out.println(cur.Price);
            //ystem.out.println(visitedCities);

            //System.out.println(cur.Price);
            //System.out.println(cur.DestinationCity);
            if(cur.DestinationCity==DestinationCity){
                //System.out.println(Result);
                //System.out.println(cur.Price);
                Result=Math.min(Result, cur.Price);
                //System.out.println(Result);
                continue;
            }
            //System.out.println("abhi");
            visited.put(cur,Integer.MAX_VALUE);
            if(db.containsKey(cur.DestinationCity)==false){
                continue;
            }
            //System.out.println(Result);
            HashMap<String,HashMap<String,Integer>> nexts = db.get(cur.DestinationCity);
            //System.out.println(visitedCities);
            for(String i:nexts.keySet()){
                if(visitedCities.contains(i)){
                    continue;
                }
                HashMap<String,Integer> poss_Air = nexts.get(i);
                //System.out.println(i);
                
                for(String j:poss_Air.keySet()){
                    FlightCostNode newfn = new FlightCostNode();
                    newfn.AirlineName=j;
                    newfn.SourceCity=cur.DestinationCity;
                    newfn.DestinationCity=i;
                    newfn.Price=cur.Price+poss_Air.get(j);
                    newfn.hop=cur.hop+1;
                    pq.add(newfn);
                }
            }
        }
        return Result;

        //throw new UnsupportedOperationException("Unimplemented method 'find'");
    }

    
}
