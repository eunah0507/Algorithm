import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String answer = "";

        if (str.contains("D2") || str.contains("d2")){
            answer = "D2";
        }else{
            answer = "unrated";
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
