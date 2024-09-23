import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String str = String.valueOf(num);
        int answer = 0;

        if (!str.contains("7") && num % 7 != 0){
            answer = 0;
        }else if (!str.contains("7") && num % 7 == 0){
            answer = 1;
        }else if(str.contains("7") && num % 7 != 0){
            answer = 2;
        }else if (str.contains("7") && num % 7 == 0){
            answer = 3;
        }

        sb.append(answer);
        System.out.println(sb.toString());

    }
}
