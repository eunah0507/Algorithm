import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        // 후안보다 공격력이 높은 무기를 가지고 있어야한다.
        // N개의 무기 중, 한 개만 구매할 수 있다. X원보다 비싼건 살 수 없다.
        // 첫 번째 줄에는 무기의 수 N, 두 번째 줄에는 가진돈 X와 후안의 공격력 S
        // 세 번째 줄에는 무기의 가격과 공격력이 주어진다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int money = Integer.parseInt(st.nextToken());
        int huahn = Integer.parseInt(st.nextToken());
        String answer = "";

        for (int i = 0; i < num; i++) {
        st = new StringTokenizer(br.readLine());

            int weapon = Integer.parseInt(st.nextToken());
            int attack = Integer.parseInt(st.nextToken());

            if (money >= weapon && attack > huahn){
                answer = "YES";
                break;
            }else{
                answer = "NO";
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());

    }
}