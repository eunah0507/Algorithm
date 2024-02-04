import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 주어진 N보다 크거나 같은 소수를 하나씩 출력한다.

        // 소수 빨리 구하기 : 루트 씌우기
        // 루트 씌워서 가장 비슷한 숫자로 나눠서 안나눠지면 소수이다.

        // 입력받은 소수를 Math.squrt()로 나눠본다.
        // 안나눠지면 소수니까 그대로 출력한다.
        // 나눠지면 소수가 아니므로 입력받은 수를 증가시킨다.
        // 그대로 다시 나눠본다.
        // 안나눠질 때 그 수는 소수이므로 그 수를 출력한다.

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        long num = sc.nextLong();
        List<Long> list = new ArrayList<>();
        double sqrt = 0;

        for (int i = 0; i < num; i++) {
            list.add(sc.nextLong());
            long j = 0;

            if (list.get(i) != 0 && list.get(i) != 1) {
                for (j = list.get(i); ; j++) {
                    // j가 소수라면 이 for문을 빠져나간다.
                    boolean sosu = true;
                    for (int k = 2; k <= Math.sqrt(j); k++) {
                        if (j % k == 0) {
                            sosu = false;
                            break;
                        }
                    }
                    if (sosu) {
                        break;
                    }
                }
            }else if(list.get(i) == 0) {
                j = 2;
            }else{
                j = 2;
            }

            sb.append(j);
            sb.append("\n");

        }

        System.out.println(sb.toString());
    }
}