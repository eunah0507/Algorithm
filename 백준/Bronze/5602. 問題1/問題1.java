import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] count = new int[m];
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                count[j] += Integer.parseInt(st.nextToken());
            }
        }
        
        int[][] place = new int[m][2];
        for (int i = 0; i < m; i++) {
            place[i][0] = i + 1;
            place[i][1] = count[i];
        }

        Arrays.sort(place, (a, b) -> {
            if (b[1] != a[1]) return b[1] - a[1];
            return a[0] - b[0];
        });

        for (int i = 0; i < m; i++) {
            sb.append(place[i][0]).append(' ');
        }

        System.out.println(sb.toString());
    }
}
