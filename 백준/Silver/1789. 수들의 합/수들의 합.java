import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        // 자연수 합을 구하는 갯수가 많아야 하므로 1부터 더해준다.
        // S와 같으면 그냥 count 출력한다
        // S보다 커지면 count -1하고 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long num = Long.parseLong(br.readLine());
        long count = 0;
        long sum = 0;

        for (int i = 1; sum < num; i++) {
            sum += i;
            count++;

            if (sum > num){
                count--;
                break;
            }
        }

        sb.append(count);
        System.out.println(sb.toString());
    }
}