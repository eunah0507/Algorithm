import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 배(0) 등(1)으로 나뉘어 윷의 상태가 주어진다.
        // 도A, 개B, 걸C, 윷D, 모E로 나타낸다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String answer = "";
        // 값을 배열로 받아준다.
        int[] play = new int[4];
        // 배가 나왔을 때 카운트할 변수
        int zero = 0;
        // 등이 나왔을 때 카운트할 변수
        int one = 0;

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 윷놀이 갯수를 초기화 해준다.
            zero = 0;
            one = 0;

            for (int j = 0; j < 4; j++) {
                play[j] = Integer.parseInt(st.nextToken());

                if (play[j] == 0) {
                    zero++;
                } else {
                    one++;
                }

                if (zero == 1 && one == 3) {
                    answer = "A";
                } else if (zero == 2 && one == 2) {
                    answer = "B";
                } else if (zero == 3 && one == 1) {
                    answer = "C";
                } else if (zero == 4 && one == 0) {
                    answer = "D";
                } else {
                    answer = "E";
                }
            }
                sb.append(answer).append("\n");
        }
        System.out.println(sb.toString());
    }
}