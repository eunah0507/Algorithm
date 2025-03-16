import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N: 버스 개수, X: 지각하지 않기 위한 최대 도착 시간
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int latestStartTime = -1; 

        // N개의 버스를 검사
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int T = Integer.parseInt(st.nextToken());

            // 버스를 탔을 때 X분 이내에 도착 가능한 경우
            if (S + T <= X) {
                latestStartTime = Math.max(latestStartTime, S);
            }
        }

        sb.append(latestStartTime);
        System.out.println(sb.toString());
    }
}
