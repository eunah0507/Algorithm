import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static long c;
    static long[] arr;
    static ArrayList<Long> leftList = new ArrayList<>();
    static ArrayList<Long> rightList = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        c = Long.parseLong(st.nextToken());

        arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        dfs(0, n / 2, 0, leftList);
        dfs(n / 2, n, 0, rightList);

        Collections.sort(rightList);

        long count = 0;
        for (long sum : leftList) {
            count += upperBound(rightList, c - sum);
        }

        sb.append(count);
        System.out.print(sb.toString());
    }

    static void dfs(int start, int end, long sum, ArrayList<Long> list) {
        if (sum > c) {
            return;
        }
        if (start == end) {
            list.add(sum);
            return;
        }

        dfs(start + 1, end, sum, list);
        dfs(start + 1, end, sum + arr[start], list);
    }

    static int upperBound(ArrayList<Long> list, long target) {
        int left = 0;
        int right = list.size();

        while (left < right) {
            int mid = (left + right) / 2;
            if (list.get(mid) <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}