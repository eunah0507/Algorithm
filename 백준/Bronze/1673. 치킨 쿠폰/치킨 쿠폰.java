import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // 1. 치킨 쿠폰 n장 + 쿠폰 k개당 쿠폰 1장으로 교환
        // Q. 강민이가 지금 가지고 있는 쿠폰으로 최대 몇 마리의 치킨을 먹나?

        // 4 3 > 5 > 쿠폰 4개  > 도장 4개 > 5마리
        // 10 3 > 14 > 10마리 >> 3마리 + 1장 >> 1마리 >> 14마리
        // 100 5 > 124 > 100마리 + 쿠폰 25장 >> 20마리 >> 4마리 >> 124마리


        String str = "";
        while ((str = br.readLine()) != null && !str.isEmpty()){
            StringTokenizer st = new StringTokenizer(str);
            int coupon = Integer.parseInt(st.nextToken());
            int stamp = Integer.parseInt(st.nextToken());
            int couponPlus = coupon;
            int answer = coupon;

            while (couponPlus >= stamp){
                answer += couponPlus / stamp;
                couponPlus = (couponPlus/stamp) + (couponPlus % stamp);
            }

            sb.append(answer).append("\n");
        }
        System.out.println(sb.toString());
    }
}