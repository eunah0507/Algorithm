import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int length = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String answer = "";

        if (str.contains("gori")){
            answer = "YES";
        }else{
            answer = "NO";
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
