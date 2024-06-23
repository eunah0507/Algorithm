import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 교수님.. 문제는 그냥 평범하게 내시라고요..
        // j번째 문제의 정답은 ((j-1) mod 5) + 1 이며, mod는 나머지 연산을 뜻한다.
        // 문제의 보기는 1번부터 5번까지이다.
        // 만점을 받은 학생은 재시험 대상자다. 몇 명이 재시험을 봐야하는가?

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            int studentRight = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 10; j++) {
                int studentAnswer = Integer.parseInt(st.nextToken());
                int answer = ((j-1)%5)+1;

                if (studentAnswer == answer){
                    studentRight++;
                }
            }

            if (studentRight == 10){
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
