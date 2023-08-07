import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.get("baseball")); // Key - value
        // 해당하는 key가 없을 때엔 NULL 값 출력
        // default 값을 얻고싶다면 map.getOrDefault method

        System.out.println(map.containsKey("baseball")); // boolean , 있을 경우 true 아닐 경우 false 출력
        System.out.println(map.remove("people")); // remove
        System.out.println(map.size()); // HashMap의 전체 크기
        System.out.println(map.keySet()); // HashMap의 모든 key 출력

        // 맵의 가장 큰 특징은 순서에 의존하지 않고 Key로 Value를 가져오는 것이다. 가끔 순서대로 데이터를 가져오거나 key에 의해 sort하도록 저장하고 싶을 때가 있을탠데, LinkedHashMap, TreeMap을 사용하면 된다.
        TreeMap<Integer, Integer> tmap = new TreeMap<>();
        LinkedHashMap<Integer, Integer> lmap = new LinkedHashMap<>();

    }
}
