import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int Soongsil = Integer.parseInt(st.nextToken());
        int Korea = Integer.parseInt(st.nextToken());
        int Hanyang = Integer.parseInt(st.nextToken());
        int sum = Soongsil + Korea + Hanyang;

        int min = Math.min(Korea, Hanyang);
        min = Math.min(min, Soongsil);

        if (sum >= 100){
            sb.append("OK");
        }else {
            if (min == Soongsil){
                sb.append("Soongsil");
            }else if(min == Korea){
                sb.append("Korea");
            }else{
                sb.append("Hanyang");
            }
        }

        System.out.println(sb.toString());


    }
}