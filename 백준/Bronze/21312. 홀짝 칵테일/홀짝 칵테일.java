import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answerA = 1;
        int answerB = 1;
        boolean flag = false;
        
        for(int i = 0; i < 3; i++) {
            int a = Integer.parseInt(st.nextToken());

            if(a % 2 == 1) {
                answerA *= a;
                
                if(!flag) {
                    flag = true;
                }
            }
            answerB *= a;
        }
        
        sb.append(flag ? answerA : answerB);
        System.out.println(sb.toString());
    }
}
