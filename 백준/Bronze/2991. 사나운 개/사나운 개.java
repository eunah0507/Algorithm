import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int numA = Integer.parseInt(st.nextToken());
        int numB = Integer.parseInt(st.nextToken());
        int numC = Integer.parseInt(st.nextToken());
        int numD = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < 3; i++) {
            int num = Integer.parseInt(st.nextToken());

            int Fdog = num % (numA + numB);
            int Sdog = num % (numC + numD);
            int count = 0;

            if(Fdog <= numA && Sdog <= numC) {
                count = 2;
            }else if(Fdog <= numA || Sdog <= numC) {
                count = 1;
            }

            if(Fdog == 0) {
                count -= 1;
            }
            if(Sdog == 0) {
                count -= 1;
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb.toString());
    }
}
