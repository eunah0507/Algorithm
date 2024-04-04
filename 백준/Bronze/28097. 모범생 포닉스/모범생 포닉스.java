import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = (N-1)*8;
        for(int i=0;i<N;i++){
            answer += Integer.parseInt(st.nextToken());
        }
        System.out.println(answer/24+" "+answer%24);



    }
}