import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 직각 삼각형이 맞다면 right, 아니면 wrong을 출력한다
        // 직각삼각형 기준 : 제일 긴 변의 제곱 = 나머지 변의 각각 제곱

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            } else {
                int numA = (int) Math.pow(a, 2);
                int numB = (int) Math.pow(b, 2);
                int numC = (int) Math.pow(c, 2);
                int highest = Math.max(Math.max(numA, numB), numC);
                int sum = numA + numB + numC;

                String answer = "";

                if (sum / 2 == highest) {
                    answer = "right";
                } else {
                    answer = "wrong";
                }

                sb.append(answer).append("\n");
            }
        }

        System.out.println(sb.toString());


    }
}