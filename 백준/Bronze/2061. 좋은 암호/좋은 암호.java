import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 암호화 방식을 사용할 때 소수를 이용하는 경우가 많다.
        // 키 값 K와 정수 L이 주어졌을 때, K를 인수분해 하면 항상 L 이상의 값으로만 이뤄지는지?
        // L이 K의 소수이면 Good 아니면 Bad
        // Bad일때는 K의 가장 작은 인수를 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger k = new BigInteger(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        boolean [] notPrimes = new boolean[l + 1];
        boolean flag = false;
        notPrimes[1] = true;

        for (int i = 2; i < l; i++) {
            // 소수가 아니라면 그냥 지나감
            if (notPrimes[i]){
                continue;
            }

            // 소수가 아닌 수들을 모두 true로 활성화
            for (int j = i+i; j <= l; j+=i) {
                notPrimes[j] = true;
            }

            // 아래의 if문을 사용하기 위해서 위의 for문에서 l을 포함하지 않는다.
            if (k.mod(BigInteger.valueOf(i)).compareTo(BigInteger.ZERO) == 0){
                sb.append("BAD").append(" ").append(i);
                flag = true;
                break;
            }
        }

        if (flag == false){
            sb.append("GOOD");
        }

        System.out.println(sb.toString());

    }
}
