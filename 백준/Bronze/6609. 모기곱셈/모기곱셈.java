import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String line;

        while ((line = br.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }

            StringTokenizer st = new StringTokenizer(line);
            int m = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            for (int i = 0; i < n; i++) {
                int nextM = p / s;
                int nextP = l / r;
                int nextL = m * e;

                m = nextM;
                p = nextP;
                l = nextL;
            }

            sb.append(m).append('\n');
        }

        System.out.print(sb.toString());
    }
}