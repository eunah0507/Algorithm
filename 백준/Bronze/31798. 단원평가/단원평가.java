import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 원 위의 두 수의 합 = 원 아래 수의 제곱
        // a,b가 주어진 경우 = c의 제곱근

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int answer = 0;

        // a가 0이라면, c의 제곱에서 b를 뺀 값이 된다.
        if (a == 0){
            answer = (c * c) - b;
        // b가 0이라면, 위와 동일하게 c의 제곱에서 a를 뺀 값이된다.    
        }else if(b == 0){
            answer = (c * c) - a;
        // c가 0이라면, a+b가 제곱근이다.    
        }else if(c == 0){
            answer = (int)Math.sqrt(a+b);
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}