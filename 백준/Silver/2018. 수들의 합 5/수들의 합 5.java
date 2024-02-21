import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 1; i <= num; i++) {
            int sum = 0;
            for (int j = i; j <= num; j++) {
                sum += j;

                if (sum == num){
                    answer++;
                    break;
                }else if(sum > num){
                    break;
                }
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());

    }
}