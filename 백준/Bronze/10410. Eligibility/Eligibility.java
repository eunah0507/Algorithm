import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String start = st.nextToken(); // YYYY/MM/DD
            String birth = st.nextToken(); // YYYY/MM/DD
            int courses = Integer.parseInt(st.nextToken());

            int startYear = parseYear(start);
            int birthYear = parseYear(birth);

            sb.append(name).append(' ');
            if (startYear >= 2010) {
                sb.append("eligible");
            } else if (birthYear >= 1991) {
                sb.append("eligible");
            } else if (courses >= 41) {
                sb.append("ineligible");
            } else {
                sb.append("coach petitions");
            }
            if (i + 1 < t) {
                sb.append('\n');
            }
        }

        System.out.print(sb.toString());
    }

    private static int parseYear(String date) {
        int y = 0;
        for (int i = 0; i < 4; i++) {
            y = y * 10 + (date.charAt(i) - '0');
        }
        return y;
    }
}
