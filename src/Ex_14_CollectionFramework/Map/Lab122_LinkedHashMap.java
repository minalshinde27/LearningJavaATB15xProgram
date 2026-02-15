package Ex_14_CollectionFramework.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab122_LinkedHashMap {
    public static void main() {

        Map<String, String> countries = new LinkedHashMap<>();

        countries.put("IN", "India");
        countries.put("US", "United States");
        countries.put("UK", "United Kingdom");
        countries.put("JP", "Japan");

        System.out.println(countries);

        for (Map.Entry<String, String> items : countries.entrySet()){
            System.out.println(items.getKey()+" > "+items.getValue());
        }
    }
}
