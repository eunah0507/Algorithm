import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 1. 테스트케이스를 입력받는다.
        // 2. ArrayList<>를 만들고 기본값을 0을 준다.
        // 3. contains()를 사용해서 있으면 값을 1로 변경한다.

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        Map<Integer, Integer> list = new HashMap<>();

        for (int i = 0; i < num; i++) {
            list.put(sc.nextInt(), 0);
        }

        int num2 = sc.nextInt();

        for (int i = 0; i < num2; i++) {
            if (list.containsKey(sc.nextInt())){
                sb.append("1 ");
            }else{
                sb.append("0 ");
            }
        }

        System.out.println(sb.toString());
    }
}