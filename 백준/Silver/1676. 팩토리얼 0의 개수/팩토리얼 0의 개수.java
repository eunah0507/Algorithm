import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        // N!을 계산했을 때, 뒤에 0이 몇 개 있느냐?
        // ex. 10! = 3,628,800 == 뒤에서부터 0이 2개 있음 == 답 2개

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        // num의 Factorial 값을 구할 변수
        BigInteger numFac = BigInteger.valueOf(1);
        // 0이 몇 개인지 세줄 변수
        int count = 0;

        // Factorial 값을 구한다.
        for (int i = 1; i <= num; i++) {
            numFac = numFac.multiply(BigInteger.valueOf(i));
        }

        // 10씩 나눠주면서 0이 몇 개인지 세준다.
        while(true){
            if (numFac.remainder(BigInteger.valueOf(10)) != BigInteger.ZERO){
                break;
            }else{
                numFac = numFac.divide(BigInteger.valueOf(10));
                count++;
            }
        }

        sb.append(count);
        System.out.println(sb.toString());
    }
}