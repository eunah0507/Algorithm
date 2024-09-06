import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int K = Integer.parseInt(br.readLine());
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if(i%K==0){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
