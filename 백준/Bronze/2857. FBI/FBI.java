import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = 0;

        for (int i = 1; i <= 5; i++) {
            String str = br.readLine();

            if (str.contains("FBI")){
                count++;
                sb.append(i).append(" ");
            }
        }

        if (count == 0){
            sb.append("HE GOT AWAY!");
        }


        System.out.println(sb.toString());
    }
}