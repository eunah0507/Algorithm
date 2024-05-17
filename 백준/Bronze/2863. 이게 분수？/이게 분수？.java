import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // A,B,C,D가 주어졌을 때 기본적으로 A/C + B/D 이다.
        // 90도 시계 방향으로 돌렸을 때 몇 번 회전해야 최대값이 되는지 구하라.
        // 최대 3번까지 돌릴 수 있다. Math.max를 이용하자

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        double c = Integer.parseInt(st.nextToken());
        double d = Integer.parseInt(st.nextToken());

        int count = 0;

        // a,b,c,d > c,a,d,b > d,c,b,a > b,d,a,c
        double answerA = (a / c) + (b / d);
        double answerB = (c / d) + (a / b);
        double answerC = (d / b) + (c / a);
        double answerD = (b / c) + (d / a);

        double totalAnswer = Math.max(Math.max(Math.max(answerA, answerB), answerC), answerD);

        if (totalAnswer == answerA){
            count = 0;
        }else if(totalAnswer == answerB){
            count = 1;
        }else if(totalAnswer == answerC){
            count = 2;
        }else{
            count = 3;
        }

        sb.append(count);
        System.out.println(sb.toString());
    }
}
