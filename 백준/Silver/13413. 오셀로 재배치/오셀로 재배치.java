import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int numA = Integer.parseInt(br.readLine());
            String s1 = br.readLine();
            String s2 = br.readLine();

            int wToB = 0;
            int bToW = 0;

            for (int j = 0; j < numA; j++) {
                char c1 = s1.charAt(j);
                char c2 = s2.charAt(j);

                if (c1 == 'W' && c2 == 'B'){
                    wToB++;
                } else if (c1 == 'B' && c2 == 'W'){
                    bToW++;
                } 
            }

            sb.append(Math.max(wToB, bToW)).append("\n");
        }

        System.out.print(sb.toString());
    }
}
