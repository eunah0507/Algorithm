import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 3문제가 사용, N팀 참가, 몇 팀이 성실하게?
        // 3문제 중, 1문제 이상 해결해야한다.
        // T 시간동안 해결 했을 때, T보다 작은 문제들은 모두 해결
        // 첫 번째 줄에는 참가한 팀의 수 N
        // 두 번째 줄에는 문제 해결한 시간 T들이 주어진다. 해결X = -1
        // 3개의 값이 주어지는데, 앞의 문제를 못풀고 뒤를 풀었을 경우에는 성실X

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int teamNum = Integer.parseInt(br.readLine());
        int goodTeam = 0;

        for (int i = 0; i < teamNum; i++) {
            int[] score = new int[3];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                score[j] = Integer.parseInt(st.nextToken());
            }

            if( (score[0] >= 0 && score[1] >= 0 && score[2] >= 0 ) && score[0] <= score[1] && score[1] <= score[2] ){
                goodTeam++;
            }else if( (score[0] >= 0 && score[1] >= 0 && score[2] < 0 ) && score[0] <= score[1] ){
                goodTeam++ ;
            }else if(score[0] >= 0 && score[1] < 0 && score[2] < 0 ){
                goodTeam++;
            }

        }

        sb.append(goodTeam);
        System.out.println(goodTeam);

    }
}