import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 칭호 개수
        int M = Integer.parseInt(st.nextToken()); // 캐릭터 개수

        TreeMap<Integer, String> titleMap = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String title = st.nextToken();
            int powerLimit = Integer.parseInt(st.nextToken());

            if (!titleMap.containsKey(powerLimit)) { 
                titleMap.put(powerLimit, title);
            }
        }

        int[] powers = new int[M];
        for (int i = 0; i < M; i++) {
            powers[i] = Integer.parseInt(br.readLine());
        }

        for (int power : powers) {
            sb.append(titleMap.ceilingEntry(power).getValue()).append("\n");
        }

        System.out.println(sb.toString());
    }

}
