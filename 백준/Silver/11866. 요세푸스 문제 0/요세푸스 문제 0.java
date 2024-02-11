import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        // 차례대로 제거해서 출력하는 문제

        // 디큐를 써보자
        // K번째 사람은 pop하고, 1 ~ k-1은 다시 offer해준다.
        // 반복하고, K보다 수가 작아질 경우 순서대로 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        while(true){
            if (deque.size() == 0){
                break;
            }else{
                for (int i = 1; i < K; i++) {
                    deque.offerLast(deque.pollFirst());
                }
                sb.append(deque.poll());
                sb.append(", ");
            }
        }

        sb.deleteCharAt(sb.length() -1);
        sb.deleteCharAt(sb.length() -1);

        System.out.println("<" + sb.toString() + ">");
    }
}
