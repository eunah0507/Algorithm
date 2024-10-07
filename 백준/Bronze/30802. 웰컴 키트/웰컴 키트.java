import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] person = new int[6];
        for (int i=0;i<6;i++){
            person[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int answer1 = 0;
        for (int i = 0; i < 6; i++) {
            answer1 += (person[i]/T);
            person[i] %= T;
            if(person[i] != 0)
                answer1++;
        }
        int answer2 = N / P;
        int answer3 = N % P;

        sb.append(answer1).append('\n').append(answer2).append(' ').append(answer3);
        System.out.println(sb.toString());
    }
}
