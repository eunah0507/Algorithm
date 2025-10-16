import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        char game = st.nextToken().charAt(0);

        HashSet<String> players = new HashSet<>();

        for (int i = 0; i < N; i++) {
            players.add(br.readLine());
        }

        int playerCount = players.size();
        int groupSize = 0;

        if (game == 'Y') {
            groupSize = 2;
        } else if (game == 'F') {
            groupSize = 3;
        } else if (game == 'O') {
            groupSize = 4;
        }

        int result = playerCount / (groupSize - 1);
        sb.append(result);
        System.out.println(sb.toString());
    }
}