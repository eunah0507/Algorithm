import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 두 줄의 문장중, 겹치는 단어 출력하기

        // 두 개의 테스트케이스를 TreeSet으로 입력받는다.
        // 겹치는 문장을 ArrayList로 따로 출력한다.

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        int M = sc.nextInt();

        Set<String> noListen = new TreeSet<>();
        Set<String> noLook = new TreeSet<>();

        List<String> answer = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            noListen.add(sc.next());
        }

        for (int i = 0; i < M; i++) {
            noLook.add(sc.next());
        }

        for (String s : noLook) {
            if (noListen.contains(s)){
                answer.add(s);
            }
        }

        sb.append(answer.size());
        sb.append("\n");

        for (String s : answer) {
            sb.append(s);
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}