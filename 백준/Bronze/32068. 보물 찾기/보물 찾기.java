import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        // 홀수일때는 더하고, 짝수일 때는 뺀다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
            int startPoint = Integer.parseInt(st.nextToken());

            int index = 1;

            while (true){
                if (startPoint == left || startPoint == right){
                    break;
                }else{
                    if (index % 2 == 0){
                        startPoint -= index;
                    }else{
                        startPoint += index;
                    }

                    index++;
                }
            }

            sb.append(index).append("\n");
        }

        System.out.println(sb.toString());
    }
}
