// Map = <Key, Value>
// Only Unique key are allowed.
// Similar to ArrayList but there is a Key-Value pair.

// Methods -> .containsKey(k) .containsValue(v)
//            .replace(k, v) .replace(k,oldV, newV)
//            .remove(k) .remove(k,v)
//            .keySet() .values() .entrySet()

package Map;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    public static void main(String[] args) {
        Map<String, String> ct = new HashMap();

        ct.put("us", "United States");
        ct.put("in", "India");
        ct.put("in", "Jai-India"); // value will be replaced, if its the same key
        ct.putIfAbsent("in", "India");
        ct.put("br", "Brazil");

        ct.remove("br");

        System.out.println(ct);
        System.out.println(ct.keySet());
        System.out.println(ct.values());
        System.out.println(ct.get("in"));
        System.out.println(ct.getOrDefault("ab", "Others"));
        System.out.println(ct.containsKey("IN"));
        System.out.println(ct.containsKey("in"));
    }
}
