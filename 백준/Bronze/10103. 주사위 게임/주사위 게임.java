import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 테스트케이스만큼의 라운드가 진행된다.
        // 두 사람이 주사위를 각각 던져서, 낮은 수가 나온 사람만 차감한다
        // 게임이 끝나고 난 뒤, 두 사람의 점수를 구하라

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int chang = 100;
        int sang = 100;

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int diceChang = Integer.parseInt(st.nextToken());
            int diceSang = Integer.parseInt(st.nextToken());

            if (diceChang > diceSang) {
                sang -= diceChang;
            } else if (diceChang == diceSang) {

            } else {
                chang -= diceSang;
            }
        }

        sb.append(chang).append("\n").append(sang);
        System.out.println(sb.toString());
    }
}