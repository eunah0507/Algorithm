import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] count = new int[1000001];
        int[] answer = new int[n];
        int[] stack = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            count[arr[i]]++;
            answer[i] = -1;
        }

        int top = -1;

        for (int i = 0; i < n; i++) {
            while (top >= 0 && count[arr[stack[top]]] < count[arr[i]]) {
                answer[stack[top--]] = arr[i];
            }

            stack[++top] = i;
        }

        for (int i = 0; i < n; i++) {
            sb.append(answer[i]).append(' ');
        }

        System.out.print(sb.toString());
    }
}