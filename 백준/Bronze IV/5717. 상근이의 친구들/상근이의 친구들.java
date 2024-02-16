import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int boy = Integer.parseInt(st.nextToken());
            int girl = Integer.parseInt(st.nextToken());

            if (boy == 0 && girl == 0){
                break;
            }else{
                int sum = boy + girl;
                sb.append(sum).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}