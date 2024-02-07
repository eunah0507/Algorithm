import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 처음 입력받는 수가 11이하면 아침 12~16점심 그 외 저녁
        // 두번째 입력받는 수가 0이면 술 X 1이면 술 O
        // 이 때에 밥을 몇 개로 만들어야하나?
        // 1. 술하고 먹으면 무조건 밥알 280개
        // 2. 점심식사가 아니면 밥알 280개
        // 3. 점심식사이면서 술과 안먹으면 밥알 320개

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (B == 1) {
            sb.append(280);
        } else if (A <= 11 || A > 16) {
            sb.append(280);
        } else if (A >= 12 && A <= 16 && B == 1) {
            sb.append(280);
        } else {
            sb.append(320);
        }

        System.out.println(sb.toString());

    }
}