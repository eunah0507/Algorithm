import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        // X사: 1L당 A엔
        // Y사: 기본요금 B엔, 사용량 C 이하라면 기본요금
        //      C이상일 경우 B+추가요금(L당 D엔)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int water = Integer.parseInt(br.readLine());

        int xCharge = water * x;
        int yCharge = 0;

        if (water <= c){
            yCharge = y;
        }else{
            yCharge = y + ((water - c) * d);
        }

        int min = Math.min(xCharge, yCharge);

        sb.append(min);
        System.out.println(sb.toString());
    }
}
