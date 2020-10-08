import java.util.HashMap;

public class TestServer {
    public static void main(String[] args) {
        HashMap servers = new HashMap<Character, Integer>();
        servers.put('X', 3);
        servers.put('Y', 1);
        servers.put('Z', 1);

        LoadBalancer balancer = new LoadBalancer(servers);
        balancer.convertValueToRanges();
        for (int i = 1 ; i <= 100; i++) {
            System.out.print(balancer.getServer());
        }
    }
}
