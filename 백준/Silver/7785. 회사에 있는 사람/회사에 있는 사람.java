import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 꼴에 지만 출세한 상근이네 회사에 남아있는 사람 구하는 문제

        // 여러 자료구조 중, Map을 사용해본다.
        // 맵에 테스트케이스를 입력받는다.
        // 조건문을 사용해서 leave를 받으면 enter도 같이 삭제한다.
        // 내림차순으로 출력해야하므로 TreeMap의 reverseOrder를 사용한다.

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        Map<String, String> map = new TreeMap<>(Comparator.reverseOrder());

        // 놀랍게도? 이렇게 넣는답니다. 헐~
        for (int i = 0; i < num; i++) {
            map.put(sc.next(), sc.next());
        }

        // forEach문을 돌려서 s에 map의 key값이 들어감
        for (String s : map.keySet()) {
            // value변수를 만들어서 map의 value값이 들어감
            String value = map.get(s);
            // value에 enter가 있으면 s를 출력하겠다.
            if (value.equals("enter")){
                sb.append(s);
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}