import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int day = Integer.parseInt(st.nextToken());
        int numA = Integer.parseInt(st.nextToken());
        int numB = Integer.parseInt(st.nextToken());

        int onionA = 1;
        int onionB = 1;

        for (int i = 0; i < day; i++) {
            onionA += numA;
            onionB += numB;
            int tmp = 0;

            if (onionA < onionB){
                tmp = onionA;
                onionA = onionB;
                onionB = tmp;
            }else if(onionA == onionB){
                onionB -= 1;
            }
        }

        sb.append(onionA).append(" ").append(onionB);
        System.out.println(sb.toString());

    }
}
