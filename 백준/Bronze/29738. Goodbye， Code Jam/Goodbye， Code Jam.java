import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // round1 = 4500
        // round2 = 1000 / round3 = 25 일 때, 마지막으로 참가한 라운드 쓰기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            int round = Integer.parseInt(br.readLine());

            if (round > 4500){
                sb.append("Case #").append(i).append(": Round 1").append("\n");
            }else if(round > 1000){
                sb.append("Case #").append(i).append(": Round 2").append("\n");
            }else if(round > 25){
                sb.append("Case #").append(i).append(": Round 3").append("\n");
            }else {
                sb.append("Case #").append(i).append(": World Finals").append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}