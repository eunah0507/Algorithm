import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        // 디큐 사용하기
        // 제일 위에 있는 카드를 바닥에 버린다. 그 다음,
        // 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮긴다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= num; i++) {
            deque.add(i);
        }

        while(true){
            int number = 0;

            if (deque.size() == 1){
                sb.append(deque.poll());
                break;
            }else{
                deque.pollFirst();
            }

            number = deque.pollFirst();
            deque.offerLast(number);
        }

        System.out.println(sb.toString());
    }
}
