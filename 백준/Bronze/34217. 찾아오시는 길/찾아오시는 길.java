import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 출발지 > 한양대 A
        int numA = Integer.parseInt(st.nextToken());
        // 출발지 > 용답역 B
        int numB = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        // 한양대 > IT C
        int numC = Integer.parseInt(st.nextToken());
        // 용답 > IT D
        int numD = Integer.parseInt(st.nextToken());

        int stationHan = numA + numC;
        int stationYoung = numB + numD;

        if (stationHan > stationYoung){
            sb.append("Yongdap");
        } else if (stationYoung > stationHan) {
            sb.append("Hanyang Univ.");
        }else{
            sb.append("Either");
        }

        System.out.println(sb.toString());
    }
}
