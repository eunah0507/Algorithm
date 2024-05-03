import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 하나의 플러그가 있고, N개의 멀티탭이 있을 때
        // 최대 몇 대의 컴퓨터를 전원에 연결할 수 있을까?
        // 멀티탭의 개수 N이 주어진다. 멀티탭이 몇 개의 플러그를 꽂을 수 있도록 되어있는지

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        int answer = 0;

        for (int i = 0; i < num; i++) {
            int plug = Integer.parseInt(br.readLine());
            sum += plug;

        }

        answer = sum - num + 1;
        sb.append(answer);
        System.out.println(sb.toString());
    }
}