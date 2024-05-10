import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 개인마다 특정 소수 p와 q를 주어 두 소수의 곱 pq를 비밀키로 둔다.
        // 두 소수 p,q 중, k보다 작은 암호는 좋지 않은 암호로 간주한다.
        // pq와 k가 주어졌을 때 좋은 암호인지 판별하라
        // BAD 일 땐, p나 q 중 더 작은 수를 함께 출력한다.


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        // pq가 10의 100승이므로 BigInteger로 받는다.
        BigInteger pq = new BigInteger(st.nextToken());
        BigInteger k = new BigInteger(st.nextToken());
        BigInteger i = new BigInteger("1");
        String answer = "";
        
        // 무한 반복을 돌리고, i를 1씩 증가시킨다.
        // 그 변수를 계속 p값에 나눠준다.
        // p / i >= k 가 되면 GOOD을 출력하고 종료한다.
        while (true){
            if (i.compareTo(k) == 1 || i.compareTo(k) == 0){
                sb.append("GOOD");
                break;
            }
            
            i = i.add(BigInteger.ONE);
            
            if (pq.remainder(i).compareTo(BigInteger.ZERO) == 0 && i.compareTo(k) == -1){
                sb.append("BAD").append(" ").append(i);
                break;
            }
        }

        System.out.println(sb.toString());

    }
}