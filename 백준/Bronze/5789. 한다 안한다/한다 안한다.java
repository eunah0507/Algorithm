import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            int size = str.length();
            if(str.charAt(size/2-1) == str.charAt(size/2) ){
                sb.append("Do-it").append("\n");
            }else{
                sb.append("Do-it-Not").append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}
