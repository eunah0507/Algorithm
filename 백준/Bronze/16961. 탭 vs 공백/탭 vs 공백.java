import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] tab = new int[367];
        int[] space = new int[367];
        int maxStay = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            maxStay = Math.max(maxStay, e - s + 1);
            if (c == 'T') {
                tab[s]++;
                if (e + 1 <= 366) tab[e + 1]--;
            } else {
                space[s]++;
                if (e + 1 <= 366) space[e + 1]--;
            }
        }

        for (int i = 1; i <= 366; i++) {
            tab[i] += tab[i - 1];
            space[i] += space[i - 1];
        }

        int occupiedDays = 0;
        int maxPeople = 0;
        int noFightDays = 0;
        int maxNoFightPeople = 0;

        for (int i = 1; i <= 366; i++) {
            int t = tab[i];
            int s = space[i];
            int total = t + s;

            if (total > 0) occupiedDays++;
            if (total > maxPeople) maxPeople = total;

            boolean noFight = false;
            if ((t == 0 && s > 0) || (s == 0 && t > 0)) noFight = false;
            else if (t == s && total > 0) noFight = true;
            else noFight = false;

            if (noFight) {
                noFightDays++;
                if (total > maxNoFightPeople) maxNoFightPeople = total;
            }
        }

        sb.append(occupiedDays).append('\n');
        sb.append(maxPeople).append('\n');
        sb.append(noFightDays).append('\n');
        sb.append(maxNoFightPeople).append('\n');
        sb.append(maxStay);

        System.out.println(sb.toString());
    }
}