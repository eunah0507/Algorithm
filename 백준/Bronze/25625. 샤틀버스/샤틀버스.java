import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 버스가 편도로 오가는 시간은 x분
        // 버스가 도착점까지 걸리는 시간은 y분
        // x >= y 는 버스는 이미 공학관으로 가고 있는 것이므로 공학관 들렀다가 정류장 가야한다.
        // 그래서 x>y일땐, x+y
        // x < y 는 버스가 정류장으로 가고 있다는 것이므로 정류장으로 바로 간다.
        // 그래서 x < y일땐 y - x

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int answer = 0;

        if (x >= y){
            answer = x + y;
        }else{
            answer = y - x;
        }

        sb.append(answer);
        System.out.println(sb.toString());

    }
}