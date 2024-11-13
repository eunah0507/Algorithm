import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numQ = Integer.parseInt(br.readLine());
        int answer = 0;

        // (number & (number - 1)) == 0 >> number가 2의 거듭제곱이지 알아보는 조건
        for (int i = 0; i < numQ; i++) {
            long number = Integer.parseInt(br.readLine());

            if ((number & (number - 1)) == 0){
                answer = 1;
            }else{
                answer = 0;
            }
            sb.append(answer).append("\n");
        }

        System.out.println(sb.toString());
    }
}
