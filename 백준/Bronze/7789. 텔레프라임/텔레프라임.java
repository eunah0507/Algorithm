import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numA = Integer.parseInt(st.nextToken());
        int numB = Integer.parseInt(st.nextToken() + String.valueOf(numA));

        int i = 2;

        String answer = "";

        while(true) {
            if((i < numA) && (numA % i == 0)) {
                answer = "No";
                break;
            }
            if((i < numB) && (numB % i == 0)) {
                answer = "No";
                break;
            }

            i++;

            if(i == numB) {
                answer = "Yes";
                break;
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}