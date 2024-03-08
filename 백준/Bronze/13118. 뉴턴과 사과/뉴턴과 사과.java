import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        // N개의 문제 후보, M개의 찬반 의견
        // M은 항상 홀수이며, 과반수를 넘어야 출제된다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= 4; i++) {
            map.put(Integer.parseInt(st.nextToken()), i);
        }
        st = new StringTokenizer(br.readLine());
        int tmp = Integer.parseInt(st.nextToken());

        if (map.containsKey(tmp))
            System.out.println(map.get(tmp));
        else
            System.out.println(0);

    }
}