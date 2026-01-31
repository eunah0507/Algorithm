import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int chapel = 2 + num;
        String answer = "";

        if (chapel <= 7){
            answer = "Oh My God!";
        }else{
            answer = "Success!";
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
