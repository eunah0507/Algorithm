import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        Integer [] arr = new Integer[num];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        Set<Integer> set = new LinkedHashSet<>();

        for (Integer i : arr) {
            set.add(i);
        }

        for (Integer i : set) {
            sb.append(i).append(" ");
        }

        System.out.println(sb.toString());
    }
}
