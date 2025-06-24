import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        // 1. 건물 이름은 알파벳 소문자로만 이루어진다.
        // 2. 만 앞글자와 맨 뒤글자는 같은 글자여야한다.
        // 3. 건물 이름에 알파벳 k와 u가 포함되어야 한다.
        // 4. 건물 이름의 마지막 글자는 gwan 이어야한다.
        // 5. 건물의 이름은 50글자보다 짧아야한다.

        String answer = "nkugwan";

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
