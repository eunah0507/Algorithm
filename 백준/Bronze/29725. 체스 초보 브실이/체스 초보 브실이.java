import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 8*8 크기의 체스판이 공백 없이 주어진다.
        // 백의 기물은 대문자, 흑의 기물은 소문자로 주어진다.
        // 백의 기물 점수 합 - 흑의 기물 점수 합을 구하는 문제
        // 킹k,K(0), 폰p,P(1), 나이트n,N(3), 비숍b,B(3), 룩R,r(5), 퀸q,Q(9), .(0)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int whiteScore = 0;
        int blackScore = 0;

        for (int i = 0; i < 8; i++) {
            String str = br.readLine();

            for (int j = 0; j <8; j++) {
                char word = str.charAt(j);

                if (word == '.') {
                    whiteScore += 0;
                    blackScore += 0;
                } else if (word == 'K') {
                    whiteScore += 0;
                } else if (word == 'k') {
                    blackScore += 0;
                } else if (word == 'P') {
                    whiteScore += 1;
                } else if (word == 'p') {
                    blackScore += 1;
                } else if (word == 'N') {
                    whiteScore += 3;
                } else if (word == 'n') {
                    blackScore += 3;
                } else if (word == 'B') {
                    whiteScore += 3;
                } else if (word == 'b') {
                    blackScore += 3;
                } else if (word == 'R') {
                    whiteScore += 5;
                } else if (word == 'r') {
                    blackScore += 5;
                } else if (word == 'Q') {
                    whiteScore += 9;
                } else if (word == 'q') {
                    blackScore += 9;
                }
            }
        }

        int totalScore = whiteScore - blackScore;

        sb.append(totalScore);
        System.out.println(sb.toString());

    }
}