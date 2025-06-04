import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int num = Integer.parseInt(input[0]);
        int numA = Integer.parseInt(input[1]);

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        int now = num % numA;
        while (!map.containsKey(now)) {
            map.put(now, list.size());
            list.add(now);
            now = (now * num) % numA;
        }

        int start = map.get(now);
        int cycleLength = list.size() - start;

        sb.append(cycleLength);
        System.out.print(sb.toString());
    }
}
