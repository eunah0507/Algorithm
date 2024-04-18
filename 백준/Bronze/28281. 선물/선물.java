import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // N일 뒤는 동원이의 생일
        // 양말은 하나에 A원, X개 살 예정
        // 단, 양말을 2일에 걸쳐 사올 것이다.

        // 각 테스트케이스를 입력 받는다
        // 배열을 birthday 크기로 만든 뒤, for문을 돌려 값을 채운다.
        // 정렬한 뒤, 0,1번째 값으로 최소비용을 구한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int birthday = Integer.parseInt(st.nextToken());
        int socks = Integer.parseInt(st.nextToken());

        // 시장가격을 구하기 위해 배열을 만든다.
        int [] arr = new int[birthday];

        st = new StringTokenizer(br.readLine());

        // for문을 돌려 각 날짜의 양말 가격을 구한다
        for (int i = 0; i < birthday; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 양일 양말값을 구하기 위해 배열을 하나 더 만든다.
        // 양일 가격을 구해야 하므로 birthday-1 크기로 만든다.
        int [] money = new int [birthday-1];

        // for문을 돌려 money[i]의 값을 구한다.
        // money[i] = arr[i]+arr[i+1]로 한다.
        for (int i = 0; i < birthday-1; i++) {
            money[i] = arr[i]+arr[i+1];
        }

        // for문을 돌려 money 배열을 구한 뒤, 정렬하여 최소값을 찾는다.
        Arrays.sort(money);

        // 가격을 구한다.
        int answer = money[0] * socks;

        sb.append(answer);

        System.out.println(sb.toString());

    }
}