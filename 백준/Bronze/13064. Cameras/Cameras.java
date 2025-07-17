import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            String car = br.readLine();

            if (car.length() != 8) continue;

            // 조건 1,2: 첫 두 자리는 1~9이고 같아야 함
            if (!isDigit1to9(car.charAt(0)) || car.charAt(0) != car.charAt(1)) continue;

            // 조건 3,4: 3,4번째도 1~9의 숫자여야 함
            if (!isDigit1to9(car.charAt(2)) || !isDigit1to9(car.charAt(3))) continue;

            // 조건 5: 5번째는 대문자 알파벳
            if (!Character.isUpperCase(car.charAt(4))) continue;

            // 조건 6~8: 마지막 3자리가 모두 1~9
            if (!isDigit1to9(car.charAt(5)) || !isDigit1to9(car.charAt(6)) || !isDigit1to9(car.charAt(7))) continue;

            sb.append(car).append("\n");
        }

        System.out.print(sb.toString());
    }

    private static boolean isDigit1to9(char ch) {
        return ch >= '1' && ch <= '9';
    }
}
