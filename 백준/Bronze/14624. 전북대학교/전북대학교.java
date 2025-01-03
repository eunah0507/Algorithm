import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        if (num % 2 == 0){
           sb.append("I LOVE CBNU");
        }else{
            for (int i = 0; i < num; i++) {
                sb.append("*");
            }

            num = num / 2 + 1;

            int first = num;
            int last = num;

            sb.append("\n");

            for (int i = 0; i < num; i++) {
                for (int j = 0; j < first; j++) {
                    sb.append(j != first - 1 ? " " : "*");
                }

                for (int j = first; j < last; j++) {
                    sb.append(j != last - 1 ? " " : "*");
                }

                sb.append("\n");
                first -= 1;
                last += 1;
            }
        }

        System.out.println(sb.toString());
    }
}
