import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

    static class Contestant implements Comparable<Contestant> {
        String name;
        int totalPoints;
        int totalPenalty;

        Contestant(String name, int a, int b, int c, int d) {
            this.name = name;
            this.totalPoints = a + c;
            this.totalPenalty = b + d;
        }

        @Override
        public int compareTo(Contestant o) {
            if (this.totalPoints != o.totalPoints) {
                return o.totalPoints - this.totalPoints;
            }
            if (this.totalPenalty != o.totalPenalty) {
                return this.totalPenalty - o.totalPenalty;
            }
            return this.name.compareTo(o.name);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine().trim());
        Contestant[] arr = new Contestant[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            arr[i] = new Contestant(name, a, b, c, d);
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            sb.append(arr[i].name).append('\n');
        }

        System.out.print(sb.toString());
    }
}
