import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        // 월간 향유회는 여러 명의 출제진과 검수진이 본인이 가능한 일정에 맞추어 문제를 만든다.
        // 출제진은 아이디어가 떠오를 때 마다 문제 포럼에 본인의 아이디를 기록한다.
        // 그 후 매달 대회가 있을 때 마다 문제 포럼에서 몇 개의 문제를 선제하여 사용한다.
        // 출제진이 x개의 문제를 포럼에 추가, 대회가 열려 y개의 문제 사용
        // 이벤트에서 y개의 문제를 사용하려 했지만 사용되지 않은 문제가 y개 미만일 경우 해산한다.
        // 처음에는 아무 문제도 문제 포럼에 존재 X
        // 월간 향유회가 도중에 해산했다면 Adios 아니라면 See you next month 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        int totalQ = 0;
        int x = 0;
        int y = 0;
        String answer = "";

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            if (x == 1){
                totalQ += y;
            }else if (x == 2){
                totalQ -= y;
            }

            if (totalQ < 0){
                answer = "Adios";
                break;
            }
        }

        if (!answer.equals("Adios")){
            answer = "See you next month";
        }

        sb.append(answer);
        System.out.println(sb.toString());

    }
}
