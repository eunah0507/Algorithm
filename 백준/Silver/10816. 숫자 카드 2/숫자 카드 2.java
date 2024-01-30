import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

       // 상근이의 카드가 주어진 M 숫자중에 몇 개 있는지 알아보는 문제

       // N과 M을 둘 다 LinkedHashMap으로 받는다.
       // 답을 출력할 배열을 만든다 M크기만큼 만든다.
       // N을 M에 비교해서 숫자를 가지고 있으면 배열을++한다.

       Scanner sc = new Scanner(System.in);
       StringBuilder sb = new StringBuilder();

       int N = sc.nextInt();
       Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < N; i++) {
            int key = sc.nextInt();

            if (map.containsKey(key)){
                int value = 1;
                value = map.get(key);
                value++;
                map.put(key, value);
            }else{
                map.put(key, 1);
            }
        }

        int M = sc.nextInt();
        int [] search = new int [M];

        for (int i = 0; i < M; i++) {
            search[i] = sc.nextInt();
        }

        int [] arr = new int [M];

        for (int i = 0; i < M; i++) {
            if (map.containsKey(search[i])){
                arr[i] = map.get(search[i]);
                sb.append(arr[i]);
                sb.append(" ");
            }else{
                arr[i] = 0;
                sb.append(arr[i]);
                sb.append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}