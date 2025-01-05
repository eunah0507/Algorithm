import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        int gan = 7;
        int ji = 9;

        for (int i = 2; i <= num; i++) {
            gan++;

            if (gan == 10){
                gan = 0;
            }

            ji++;
            if (ji == 12){
                ji = 0;
            }
        }

        char ch = (char)(ji + 'A');

        sb.append(ch).append(gan);

        System.out.println(sb.toString());
    }
}
