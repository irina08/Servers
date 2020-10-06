import java.util.*;

public class LoadBalancer {
    private Map<Character, Integer> map;
    private Set<Character> keys;

    public LoadBalancer(HashMap<Character, Integer> servers) {
        this.map = servers;
        keys = map.keySet();
    }
}
