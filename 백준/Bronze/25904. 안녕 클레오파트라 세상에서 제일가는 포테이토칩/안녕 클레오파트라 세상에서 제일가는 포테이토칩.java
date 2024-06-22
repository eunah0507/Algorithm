import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. 1번부터 N번까지 순서대로 구호를 외친다.
        // 2. 이전 번호의 사람이 냈던 목소리 높이보다 1 더 크게 외친다.
        // 3. N번이 돌았으면 1바퀴가 돌았으므로 다시 1번이 외친다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int people = Integer.parseInt(st.nextToken());
        int voice = Integer.parseInt(st.nextToken());
        int [] arr = new int [people+1];

        int answer = 0;
        boolean flag = false;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < people; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int i = 0;

        while (true){
            if (arr[i] < voice ){
                answer = i + 1;
                break;
            }else{
                i++;
                i %= people;
                voice++;
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
