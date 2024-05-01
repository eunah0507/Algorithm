import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 본인이 귀엽다 믿는 준희를 위한 설문조사
        // 0 == 안귀여움 , 1 == 귀여움

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String answer = "";
        int yesCute = 0;
        int noCute = 0;

        for (int i = 0; i < num; i++) {
            int isSheCute = Integer.parseInt(br.readLine());

            if (isSheCute == 1){
                yesCute++;
            }else{
                noCute++;
            }
        }

        if (yesCute > noCute){
            answer = "Junhee is cute!";
        }else{
            answer = "Junhee is not cute!";
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}