import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int D = 0;
        int P = 0;

        for (int i = 0; i < num; i++) {
            String str = br.readLine();

            if (str.equals("D")){
                D++;
            }else{
                P++;
            }

            if (D + 2 == P){
                break;
            }else if (P + 2 == D){
                break;
            }
        }

        sb.append(D).append(":").append(P);
        System.out.println(sb.toString());


    }
}