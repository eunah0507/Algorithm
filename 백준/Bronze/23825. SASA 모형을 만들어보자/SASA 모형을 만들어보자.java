import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // S모양 블럭 N개, A모양 블록 M개
        // SASA 를 1개로 친다. 총 몇 개를 만들 수 있나?

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());

        int SS = S/2;
        int AA = A/2;

        int answer = 0;

        while (true){
            if (SS < 1 || AA < 1){
                break;
            }else {
                answer++;
                SS--;
                AA--;
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}