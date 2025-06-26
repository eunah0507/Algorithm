import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] vote = new int[n + 1];
        int[] input = new int[n];
        int skip = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
            if (input[i] == 0) {
                skip++;
            } else {
                vote[input[i]]++;
            }
        }

        int maxVote = 0;
        int maxIdx = 0;
        boolean tie = false;

        for (int i = 1; i <= n; i++) {
            if (vote[i] > maxVote) {
                maxVote = vote[i];
                maxIdx = i;
                tie = false;
            } else if (vote[i] == maxVote && maxVote > 0) {
                tie = true;
            }
        }

        if (tie) {
            sb.append("skipped");
        } else {
            sb.append(maxIdx);
        }

        System.out.println(sb.toString());
    }
}
