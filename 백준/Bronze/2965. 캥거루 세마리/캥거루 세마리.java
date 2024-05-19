import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 캥거루 세 마리가 사막에서 놀고 있다.
        //

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int kangOne = Integer.parseInt(st.nextToken());
        int kangTwo = Integer.parseInt(st.nextToken());
        int kangThree = Integer.parseInt(st.nextToken());

        int answer = Math.max((kangTwo - kangOne), (kangThree - kangTwo));
        answer--;
        
        sb.append(answer);
        System.out.println(sb.toString());

    }
}
