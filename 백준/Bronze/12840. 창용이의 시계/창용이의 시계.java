import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int q = Integer.parseInt(br.readLine());

        while (q-- > 0) {
            st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());

            if (T == 1) {
                int c = Integer.parseInt(st.nextToken());
                int totalSeconds = h * 3600 + m * 60 + s + c;
                h = (totalSeconds / 3600) % 24;
                m = (totalSeconds / 60) % 60;
                s = totalSeconds % 60;
            } else if (T == 2) { 
                int c = Integer.parseInt(st.nextToken());
                int totalSeconds = (h * 3600 + m * 60 + s - c) % 86400;
                if (totalSeconds < 0) totalSeconds += 86400;
                h = (totalSeconds / 3600) % 24;
                m = (totalSeconds / 60) % 60;
                s = totalSeconds % 60;
            } else if (T == 3) { 
                sb.append(h).append(" ").append(m).append(" ").append(s).append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}
