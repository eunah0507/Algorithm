import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int maxStart = 9 * 60;     // earliest possible time (9:00)
        int minEnd = 20 * 60 + 59; // latest possible time (20:59)

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int hStart = Integer.parseInt(input[0]);
            int mStart = Integer.parseInt(input[1]);
            int hEnd = Integer.parseInt(input[2]);
            int mEnd = Integer.parseInt(input[3]);

            int start = hStart * 60 + mStart;
            int end = hEnd * 60 + mEnd;

            maxStart = Math.max(maxStart, start);
            minEnd = Math.min(minEnd, end);
        }

        if (maxStart < minEnd) {
            int sh = maxStart / 60;
            int sm = maxStart % 60;
            int eh = minEnd / 60;
            int em = minEnd % 60;

            sb.append("TAIP\n");
            sb.append(sh).append(" ").append(sm).append(" ").append(eh).append(" ").append(em);
        } else {
            sb.append("NE");
        }

        System.out.println(sb.toString());
    }
}
