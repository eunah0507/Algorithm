import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            if (str.equals("#") && age == 0 && weight == 0) {
                break;
            } else {
                if (age > 17 || weight >= 80){
                    sb.append(str).append(" Senior").append("\n");
                }else{
                    sb.append(str).append(" Junior").append("\n");
                }
            }
        }

        System.out.println(sb.toString());

    }
}
