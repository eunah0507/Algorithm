import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 자연수 n이 주어졌을 때, n보다 크고,
        // 2n보다 작거나 같은 소수의 개수를 구하는 문제

        // 값을 입력받기 전에, 범위까지의 배열을 만든다.
        // 에라토스테네스 체를 사용해서 for문을 돌린다.
        // 소수일 경우 arr[i] == 0 하고 그의 배수를 모두 1로 바꾼다.
        // 계속 반복하면서 소수인 숫자는 prime[i] == 1로 남긴다.
        // 그 후, while문을 돌려 테스트케이스를 입력받는다.
        // prime[i] == 1 인 경우에 answer++한다.
        // 출력한다.
        
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        // 문제의 제한이 1 이상 123,456까지라서 2배해준다.
        int [] arr = new int[250000];
        int [] prime = new int [250000];
        int answer = 0;
        
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 0){
                prime[i] = 1;
            }

            for (int j = i; j < arr.length ; j=j+i) {
                arr[j] = 1;
            }
        }

        while(true){
            int num = sc.nextInt();
            if (num == 0){
                break;
            }else{
                answer = 0;
                for (int i = num+1; i <= 2*num; i++) {
                    if (prime[i] == 1){
                        answer++;
                    }
                }
                sb.append(answer);
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}