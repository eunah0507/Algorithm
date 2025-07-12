import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] lastPosition = new int[11]; 
        boolean[] visited = new boolean[11];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cow = Integer.parseInt(st.nextToken());
            int pos = Integer.parseInt(st.nextToken());

            if (!visited[cow]) {
                visited[cow] = true;
                lastPosition[cow] = pos;
            } else {
                if (lastPosition[cow] != pos) {
                    answer++;
                    lastPosition[cow] = pos;
                }
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
