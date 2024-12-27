import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        int [] trophy = new int[num];
        int top = 0;
        int left = 0;
        int right = 0;

        for (int i = 0; i < num; i++) {
            trophy[i] = Integer.parseInt(br.readLine());

            if (top < trophy[i]){
                left = left + 1;
                top = trophy[i];
            }
        }

        top = 0;
        for (int i = num - 1; i >= 0; i--) {
            if (top < trophy[i]){
                right = right + 1;
                top = trophy[i];
            }
        }

        sb.append(left).append("\n");
        sb.append(right);

        System.out.println(sb.toString());
    }
}
