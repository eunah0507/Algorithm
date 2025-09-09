import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] cnt = new int[10001];

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            cnt[x]++;
        }

        int max = -1;
        int answer = 10001;
        for (int i = 1; i <= 10000; i++) {
            if (cnt[i] > max || (cnt[i] == max && i < answer)) {
                max = cnt[i];
                answer = i;
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
