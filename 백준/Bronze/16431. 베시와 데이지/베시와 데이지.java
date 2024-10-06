import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int xB = Integer.parseInt(st.nextToken());
        int yB = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int xD = Integer.parseInt(st.nextToken());
        int yD = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int xJ = Integer.parseInt(st.nextToken());
        int yJ = Integer.parseInt(st.nextToken());

        int Bmove = Math.max((Math.abs(xB - xJ)), (Math.abs(yB - yJ)));
        int Dmove = Math.abs(xD - xJ) + Math.abs(yD - yJ);

        if(Bmove < Dmove) {
            sb.append("bessie").append("\n");
        }else if(Bmove > Dmove) {
            sb.append("daisy").append("\n");
        }else {
            sb.append("tie").append("\n");
        }

        System.out.println(sb.toString());
    }
}
