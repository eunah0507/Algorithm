import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numA = Integer.parseInt(st.nextToken());
        int numB = Integer.parseInt(st.nextToken());
        int answer = 0;

        if (numA % 2 != 0 && numB % 2 != 0){
            answer = numA * numB - 1;
        }else{
            answer = numA * numB;
        }

        sb.append(answer);
        System.out.println(sb.toString());

    }
}