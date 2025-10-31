import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] teamArr = new int[N];
            Map<Integer, Integer> count = new HashMap<>();
            for (int i = 0; i < N; i++) {
                teamArr[i] = Integer.parseInt(st.nextToken());
                count.put(teamArr[i], count.getOrDefault(teamArr[i], 0) + 1);
            }

            Map<Integer, List<Integer>> scores = new HashMap<>();
            int score = 1;
            for (int t : teamArr) {
                if (count.get(t) == 6) {
                    scores.computeIfAbsent(t, k -> new ArrayList<>()).add(score++);
                }
            }

            int winner = -1;
            int minSum = Integer.MAX_VALUE;
            int tieBreaker = Integer.MAX_VALUE;

            for (int team : scores.keySet()) {
                List<Integer> s = scores.get(team);
                int sum = s.get(0) + s.get(1) + s.get(2) + s.get(3);
                int fifth = s.get(4);
                if (sum < minSum || (sum == minSum && fifth < tieBreaker)) {
                    minSum = sum;
                    tieBreaker = fifth;
                    winner = team;
                }
            }

            sb.append(winner).append('\n');
        }

        System.out.print(sb.toString());
    }
}
