import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

       // N개의의 단어 이후에 맞춰야하는 M개가 추가로 주어진다.
       // 영어를 입력받으면 숫자를, 숫자를 입력받으면 영어를 출력한다.

       // LinkedHashMap과 String 배열을 동시에 받는다.
       // 숫자를 출력할 때에는 Map의 value를 출력한다.
       // 문자를 출력할 때에는 배열을 출력한다.

       Scanner sc = new Scanner(System.in);
       StringBuilder sb = new StringBuilder();

       int num = sc.nextInt();
       int n = sc.nextInt();

       String [] arr = new String[num+1];
       String [] question = new String[n+1];
       Map<String, Integer> map = new LinkedHashMap<>();

        for (int i = 1; i <= num; i++) {
            arr[i] = sc.next();
            map.put(arr[i], i);
        }

        for (int i = 1; i <= n; i++) {
            question[i] = sc.next();
        }

        // question[i] 값을 반대로 출력한다.
        for (int i = 1; i <= n; i++) {
            char answer = question[i].charAt(0);
            if (answer >= '0' && answer <= '9'){
                sb.append(arr[Integer.parseInt(question[i])]);
                sb.append("\n");
            } else{
                sb.append(map.get(question[i]));
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}