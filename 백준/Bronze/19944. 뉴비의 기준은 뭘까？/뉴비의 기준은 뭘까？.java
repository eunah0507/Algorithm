import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String answer = "";

        if (M <= 2){
            answer = "NEWBIE!";
        }else if(M <= N && M > 2){
            answer = "OLDBIE!";
        }else if(M > N && M > 2){
            answer = "TLE!";
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}