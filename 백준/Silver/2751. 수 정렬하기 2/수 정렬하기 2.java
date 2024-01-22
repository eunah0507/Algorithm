import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 오름차순으로 수를 구하는 문제.
        // 단, 수의 범위가 넓으므로 long을 쓴다.

        // 1. 테스트케이스 long를 받아온다.
        // 2. 배열을 만들고, for문을 돌려 값을 채운다.
        // 3. 정렬한다.
        // 4. for문을 돌려 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int [] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        Set<Integer> set = new TreeSet<>();

        for (int i : arr ) {
            set.add(i);
        }

        for (int i : set){
          sb.append(i);
          sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}