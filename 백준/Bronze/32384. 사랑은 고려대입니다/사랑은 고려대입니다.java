import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numA = Integer.parseInt(br.readLine());
        String str = "";

        for (int i = 0; i < numA; i++) {
            str += "LoveisKoreaUniversity";

            if (numA != 1){
                str += " ";
            }
        }

        sb.append(str);
        System.out.println(sb.toString());
    }
}
