import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        // n대 컴퓨터에 m개의 에디터를 설치해야한다.
        // 그 중 k개의 컴퓨터 각각에 에디터 m개를 하나하나 설치했다.
        // 별도의 노트북에 에디터 m개를 한 번씩만 설치한 이후 매크로를 작동하면 설치된다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int answer = 0;

        if(k < n){
          answer = (m * k) + m;
        }else{
            answer = m * k;
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
