import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String answer = "";

        if (num < 100000 && num % 2024 == 0){
            answer = "Yes";
        }else{
            answer = "No";
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
