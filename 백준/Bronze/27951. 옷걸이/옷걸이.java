import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int u = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        char[] result = new char[num];
        boolean possible = true;

        for (int i = 0; i < num; i++) {
            if (arr[i] == 1) {
                if (u > 0) {
                    result[i] = 'U';
                    u--;
                } else {
                    possible = false;
                    break;
                }
            } else if (arr[i] == 2) {
                if (d > 0) {
                    result[i] = 'D';
                    d--;
                } else {
                    possible = false;
                    break;
                }
            }
        }

        if (!possible) {
            System.out.print("NO");
            return;
        }

        for (int i = 0; i < num; i++) {
            if (arr[i] == 3) {
                if (u > 0) {
                    result[i] = 'U';
                    u--;
                } else if (d > 0) {
                    result[i] = 'D';
                    d--;
                } else {
                    possible = false;
                    break;
                }
            }
        }

        if (!possible || u != 0 || d != 0) {
            System.out.print("NO");
        } else {
            sb.append("YES\n");
            sb.append(new String(result));
            System.out.print(sb.toString());
        }
    }
}