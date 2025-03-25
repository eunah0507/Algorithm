import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int num = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        
        int res = 0;
        Queue<Integer> pq = new PriorityQueue<>();
        
        for (int i=0; i < num; i++) {
            int cur = Integer.parseInt(st.nextToken());
            if (cur == -1) {
                res += pq.poll();
                pq.clear();
                continue;
            }
            pq.offer(cur);
        }
        
        sb.append(res+pq.poll());
        System.out.println(sb.toString());
    }
}