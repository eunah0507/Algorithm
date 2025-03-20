import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[3];
        
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for (int h = 0; h < 3; h++) {
            for (int m = 0; m < 3; m++) {
                for (int s = 0; s < 3; s++) {
                    if (h != m && m != s && s != h) {
                        if (isValidTime(arr[h], arr[m], arr[s])) {
                            count++;
                        }
                    }
                }
            }
        }

        sb.append(count);
        System.out.println(sb.toString());
    }

    private static boolean isValidTime(int h, int m, int s) {
        return (1 <= h && h <= 12) && (0 <= m && m <= 59) && (0 <= s && s <= 59);
    }
}
