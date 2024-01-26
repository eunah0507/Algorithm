import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 문자순으로 정렬하기

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        // 몇 개를 받아올지 입력받는다.
        int num = sc.nextInt();

        // 배열을 만들기 전, HashSet을 먼저 만든다.(중복 제거 위함)
        HashSet<String> set = new HashSet<>();

        // for문을 돌려 set에 추가한다.
        for (int i = 0; i < num; i++) {
            set.add(sc.next());
        }

        // set에 추가한 후, 배열을 만든다. 크기는 set.size()로 한다.
        // 중복이 제거되었을 경우, 크기를 알 수 없기 때문이다.
        String[] arr = new String[set.size()];

        // 배열의 순서에 따라 채우기 위해 변수를 하나 만든다.
        int index = 0;

        // forEach문을 돌려 arr 배열을 채운다.
        for (String s : set) {
            arr[index] = s;
            index++;
        }

        // 람다식을 이용해 정렬한다.
        Arrays.sort(arr, (e1, e2) -> {
            // 길이에 따라 정렬한다.
            if (e1.length() > e2.length()) {
                return 1;
            } else if (e1.length() < e2.length()) {
                return -1;
            } else {
                // else에 들어갈 문장들은 길이가 같을 경우이다.
                // for문을 돌려 한 글자씩 뽑아 비교한다.
                // e1.charAt(i) - 65 로 아스키코드를 이용해 비교한다.
                for (int i = 0; i < e1.length(); i++) {
                    if (e1.charAt(i) - 65 > e2.charAt(i) - 65) {
                        return 1;
                    } else if (e1.charAt(i) - 65 < e2.charAt(i) - 65) {
                        return -1;
                    }
                }
                // 이 경우는 길이도, 알파벳도 같은 경우이므로 들어올 일 없으나
                // return을 적지 않으면 오류가 나기 때문에
                // 그대로 둔다는 0을 적는다.
                // else if - else부분을 담당하고 있다고 봐도 무방하다.
                return 0;
            }
        });
        
        // 비교가 끝난 후, forEach문으로 넣어준다.
        for (String s : arr) {
            sb.append(s);
            sb.append("\n");
        }

        System.out.println(sb.toString());


    }
}