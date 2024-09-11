import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());

            Integer [] nums = new Integer[n];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int gap = Integer.MIN_VALUE;

            sb.append("Class ").append(i+1).append("\n");

            for (int j = 0; j < nums.length; j++) {
                nums[j] = Integer.parseInt(st.nextToken());

                if (max < nums[j]) {
                    max = nums[j];
                }

                if (min > nums[j]) {
                    min = nums[j];
                }
            }

            Arrays.sort(nums, Collections.reverseOrder());

            for (int j = 0; j < nums.length - 1; j++) {
                gap = Math.max(nums[j] - nums[j + 1], gap);
            }

            sb.append("Max ").append(max).append(", Min ").append(min).append(", Largest gap ").append(gap).append("\n");
        }

        System.out.println(sb.toString());
    }
}
