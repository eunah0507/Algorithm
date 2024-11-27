import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Map<String, Long[]> resistance = new HashMap<>();
        resistance.put("black", new Long[]{0L, 10L});
        resistance.put("brown", new Long[]{1L, 100L});
        resistance.put("red", new Long[]{2L, 1000L});
        resistance.put("orange", new Long[]{3L, 10000L});
        resistance.put("yellow", new Long[]{4L, 100000L});
        resistance.put("green", new Long[]{5L, 1000000L});
        resistance.put("blue", new Long[]{6L, 10000000L});
        resistance.put("violet", new Long[]{7L, 100000000L});
        resistance.put("grey", new Long[]{8L, 1000000000L});
        resistance.put("white", new Long[]{9L, 10000000000L});

        String first = br.readLine();
        String second = br.readLine();
        String third = br.readLine();

        Long answer = (resistance.get(first)[0] * 10 + resistance.get(second)[0])
                * resistance.get(third)[1] / 10;

        System.out.println(answer);
    }
}
