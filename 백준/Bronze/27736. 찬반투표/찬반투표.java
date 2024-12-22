import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String answer = "";

        StringTokenizer st = new StringTokenizer(br.readLine());

        int numA = 0;
        int numR = 0;
        int numI = 0;

        for (int i = 0; i < num; i++) {
            int result = Integer.parseInt(st.nextToken());

            if (result == 1){
                numA++;
            } else if (result == -1) {
                numR++;
            }else{
                numI++;
            }
        }

        int numM = (num + 1) / 2;

        if (numI >= numM) {
            answer = "INVALID";
        } else if (numA > numR) {
            answer = "APPROVED";
        } else {
            answer = "REJECTED";
        }

        sb.append(answer);
        System.out.println(sb.toString());

    }
}
