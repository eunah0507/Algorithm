import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;

        while (st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());

            if (num > 0){
                count++;
                continue;
            }else{
                continue;
            }
        }

        sb.append(count);
        System.out.println(sb.toString());
    }
}
