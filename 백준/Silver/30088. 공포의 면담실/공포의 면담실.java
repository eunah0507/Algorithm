import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class Dept {
        int[] arr;
        int sum;

        Dept(int[] arr) {
            this.arr = arr;
            this.sum = 0;
            for (int t : arr) this.sum += t;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        List<Dept> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] input = br.readLine().split(" ");
            int numA = Integer.parseInt(input[0]);
            int[] arr = new int[numA];
            for (int j = 0; j < numA; j++) {
                arr[j] = Integer.parseInt(input[j + 1]);
            }
            list.add(new Dept(arr));
        }

        list.sort(Comparator.comparingInt(a -> a.sum));

        long total = 0;
        long current = 0;

        for (Dept d : list) {
            for (int t : d.arr) {
                current += t;
            }
            total += current;
        }

        sb.append(total);
        System.out.print(sb.toString());
    }
}
