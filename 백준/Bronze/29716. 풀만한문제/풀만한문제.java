import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int grass = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        int answer = 0;

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (ch == 32){
                    count += 1;
                }else if (ch >= 48 && ch <= 57){
                    count += 2;
                }else if ( ch >= 97 && ch <= 122){
                    count += 2;
                }else if (ch >= 65 && ch <= 90){
                    count += 4;
                }
            }
            
            if (grass >= count){
                answer++;
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());

    }

}
