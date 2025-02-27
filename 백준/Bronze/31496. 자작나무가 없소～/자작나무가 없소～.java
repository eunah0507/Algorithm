import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1.아이템의 수 N과 단어 S를 입력받는다.
        // 2. for문을 돌려서 각각 줄을 입력 받는다.
        // 3. if문 조건 안에 _를 구분으로 완전한 단어이거나 단독으로 입력받으면 count++한다.
        // 3-1. 단어 구분은 spilt으로 한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        String str = st.nextToken();
        int answer = 0;

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            String word = st.nextToken();
            int count = Integer.parseInt(st.nextToken());

            String [] keyword = word.split("_");

            for (String s : keyword) {
                if (s.equals(str)){
                    answer += count;
                    break;
                }
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());

    }
}
