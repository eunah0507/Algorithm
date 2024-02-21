import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        double monster = a - a * ((double)b / 100);
        int answer = 0;

        if (monster < 100){
            answer = 1;
        }else{
            answer = 0;
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}