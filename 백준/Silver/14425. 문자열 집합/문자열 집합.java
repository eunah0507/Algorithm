import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // N개의 문자열이 M개의 줄에서 몇 개 포함되는지 묻는 문제

        // 1. HashSet을 사용한다.
        // 2. 두 배열에 각각 넣는다.
        // 3. contains()를 사용하여 answer++한다.

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int answer = 0;

        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            set.add(sc.next());
        }

        for (int i = 0; i < num2; i++) {
            list.add(sc.next());
        }

        for (String s : list) {
            if (set.contains(s)){
                answer++;
            }
        }

        System.out.println(answer);


    }
}