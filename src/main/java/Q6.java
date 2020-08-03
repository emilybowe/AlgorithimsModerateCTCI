import java.util.*;
public class Q6 {

    public int smallestDifference(List array1, List array2)  {
        Map<Integer, String> differencesAndSumMap = new HashMap<>();
        for(int i = 0; i < array1.size(); i++) {
            for(int j = 0; j < array2.size(); j++) {
                int key = Math.abs(((int)array1.get(i) - (int)array2.get(j)));
                differencesAndSumMap.put (key, array1.get(i) + " - "+ array2.get(j));
            }
        }
        differencesAndSumMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, String>comparingByKey());
        Integer min = Collections.min(differencesAndSumMap.keySet());
        return min;

    }

}
