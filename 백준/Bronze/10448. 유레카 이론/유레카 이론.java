import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        ArrayList<Integer> tri = new ArrayList<>();
        for (int i = 1; i * (i + 1) / 2 <= 1000; i++) {
            tri.add(i * (i + 1) / 2);
        }

        for (int test = 0; test < t; test++) {
            int k = Integer.parseInt(br.readLine());
            boolean found = false;

            outer:
            for (int i = 0; i < tri.size(); i++) {
                for (int j = 0; j < tri.size(); j++) {
                    for (int l = 0; l < tri.size(); l++) {
                        int sum = tri.get(i) + tri.get(j) + tri.get(l);
                        if (sum == k) {
                            found = true;
                            break outer;
                        }
                    }
                }
            }

            sb.append(found ? "1\n" : "0\n");
        }

        System.out.print(sb.toString());
    }
}
