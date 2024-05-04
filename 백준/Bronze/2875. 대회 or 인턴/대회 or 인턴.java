import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 대회에 나갈 땐 남1여2 = 1팀
        // 여학생 수 N, 남학생 수 M, 인턴십에 참여인원 K가 주어질 때
        // 만들 수 있는 최대의 팀은?

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int woman = Integer.parseInt(st.nextToken());
        int man = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int teamCount = 0;

        while (woman >= 2 && man >= 1 && woman+man >= 3+k){
            woman -= 2;
            man--;
            teamCount++;
        }

        sb.append(teamCount);
        System.out.println(sb.toString());

    }
}