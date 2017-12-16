package painpoints;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapInitialize {
    private static final Map<String, String> myMap;
    static
    {
        myMap = new HashMap<String, String>();
        myMap.put("a", "b");
        myMap.put("c", "d");
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        System.out.println(map);
    }
}
