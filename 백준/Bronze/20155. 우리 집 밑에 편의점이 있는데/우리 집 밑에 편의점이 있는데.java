import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 사람 수
        int n = Integer.parseInt(st.nextToken());
        // 편의점 개수
        int m = Integer.parseInt(st.nextToken());

        int [] preferences = new int [m + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int favorite = Integer.parseInt(st.nextToken());
            preferences[favorite]++;
        }

        int bestStore = 0;
        for (int i = 0; i <= m; i++) {
            bestStore = Math.max(bestStore, preferences[i]);
        }

        sb.append(bestStore);
        System.out.println(sb.toString());
    }
}
