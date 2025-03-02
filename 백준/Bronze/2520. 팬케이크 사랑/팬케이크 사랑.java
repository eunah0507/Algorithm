import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        // 반죽 1세트 당 필요한 재료
        double milk = 0.5;
        double egg = 0.5;
        double sugar = 0.25;
        double salt = 0.0625;
        double powder = 0.5625;

        // 토핑
        int banana = 1;
        int strawberry = 30;
        int choco = 25;
        int walnut = 10;

        for (int i = 0; i < num; i++) {
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());

            int MILK = (int) (Integer.parseInt(st.nextToken()) / milk);
            int EGG = (int) (Integer.parseInt(st.nextToken()) / egg);
            int SUGAR = (int) (Integer.parseInt(st.nextToken()) / sugar);
            int SALT = (int) (Integer.parseInt(st.nextToken()) / salt);
            int POWDER = (int) (Integer.parseInt(st.nextToken()) / powder);

            int panCake = Math.min(MILK, Math.min(EGG, Math.min(SUGAR, Math.min(SALT, POWDER))));

            st = new StringTokenizer(br.readLine());

            int BANANA = Integer.parseInt(st.nextToken()) / banana;
            int STRAWBERRY = Integer.parseInt(st.nextToken()) / strawberry;
            int CHOCO = Integer.parseInt(st.nextToken()) / choco;
            int WALNUT = Integer.parseInt(st.nextToken()) / walnut;

            // 모든 팬케이크 수의 합
            int totalCake = BANANA + STRAWBERRY + CHOCO + WALNUT;

            // 최종적으로 만들 수 있는 케이크
            int answer = Math.min(panCake, totalCake);

            sb.append(answer).append("\n");
        }

        System.out.println(sb.toString());
    }
}
