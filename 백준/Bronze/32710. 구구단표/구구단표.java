import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        boolean flag = false;

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i * j == num || i == num || j == num){
                    flag = true;
                    break;
                }
            }

            if (flag){
                break;
            }
        }

        if (flag){
            sb.append(1);
        }else{
            sb.append(0);
        }

        System.out.println(sb.toString());
    }
}
