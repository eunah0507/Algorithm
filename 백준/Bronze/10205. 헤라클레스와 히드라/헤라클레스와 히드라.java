import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        // 1. data set 개수 K가 주어진다.
        // 2. 히드라의 머리 개수 h가 주어진다.
        // 3. c는 불로 지지지않고 머리만 자름, b는 머리를 자른 후 불로 지짐
        // 4. 일련의 행동이 끝난 뒤 몇 개의 머리가 남아있는지?
        // 단, 히드라는 머리가 하나 이상 남아있으면 죽지 않고, 하나를 날리면 2개의 새 머리가 나온다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 1; i <= num; i++) {
            int h = Integer.parseInt(br.readLine());
            int afterAttack = h;
            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                char attack = str.charAt(j);

                if (attack == 'c'){
                    afterAttack += 1;
                }else if (attack == 'b'){
                    afterAttack -= 1;
                }
            }

            sb.append("Data Set ").append(i).append(":").append("\n").append(afterAttack).append("\n").append("\n");
        }

        System.out.println(sb.toString());

    }
}
