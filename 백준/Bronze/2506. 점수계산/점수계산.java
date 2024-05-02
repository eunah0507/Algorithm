import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 문제가 주어졌을 때, 연속으로 맞히면 가산점을 준다.
        // question[i]와 question[i+1]을 비교해서 둘 다 1이면 +1 한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int[] question = new int[num + 1];
        int count = 0;
        int answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= num; i++) {
            question[i] = Integer.parseInt(st.nextToken());

            if (question[i-1] == 1 && question[i] == 1) {
                count++;
                answer += count;
            } else if (question[i-1] == 0 && question[i] == 1){
                // 다음에 연속으로 정답일 수 있으니까 1을 준다.
                count = 1;
                answer += 1;
            }else  if(question[i-1] == 1 && question[i] == 0){
                count = 0;
            }else{
                count = 0;
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}