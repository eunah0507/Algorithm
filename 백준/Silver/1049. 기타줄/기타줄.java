import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int minPack = Integer.MAX_VALUE;
        int minSingle = Integer.MAX_VALUE;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int pack = Integer.parseInt(st.nextToken());
            int single = Integer.parseInt(st.nextToken());
            if (pack < minPack) minPack = pack;
            if (single < minSingle) minSingle = single;
        }

        int onlySingles = N * minSingle;
        int onlyPacks = ((N + 5) / 6) * minPack;
        int mixed = (N / 6) * minPack + Math.min((N % 6) * minSingle, minPack);

        int answer = Math.min(onlySingles, Math.min(onlyPacks, mixed));

        StringBuilder sb = new StringBuilder();
        sb.append(answer);
        System.out.println(sb.toString());
    }
}