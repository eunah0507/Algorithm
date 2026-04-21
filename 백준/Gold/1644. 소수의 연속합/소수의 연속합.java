import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        boolean[] isComposite = new boolean[n + 1];
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (!isComposite[i]) {
                primes.add(i);
                if ((long) i * i <= n) {
                    for (int j = i * i; j <= n; j += i) {
                        isComposite[j] = true;
                    }
                }
            }
        }

        int left = 0;
        int right = 0;
        int sum = 0;
        int count = 0;

        while (true) {
            if (sum >= n) {
                if (sum == n) {
                    count++;
                }
                sum -= primes.get(left++);
            } else {
                if (right == primes.size()) {
                    break;
                }
                sum += primes.get(right++);
            }
        }

        sb.append(count);
        System.out.print(sb.toString());
    }
}