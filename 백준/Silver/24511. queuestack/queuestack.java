import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        // 큐일때만 숫자가 작동하므로 디큐를 만든다.
        // 값을 'offerLast'로 추가하되, 1인 자리의 값은 추가하지 않는다.
        // 추가한 첫 값을 offerFirst하고, pollLast한 값은 출력한다.
        // 반복한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 처음 몇개의 자료구조를 만들 것인지 값을 받는다.
        int num = Integer.parseInt(br.readLine());

        // 지금부터 쪼개줘야하니까 받아온다.
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 큐인 경우에만 값을 추가할 것이기 때문에 boolean배열을 따로 만든다.
        boolean[] flag = new boolean[num];

        // num만큼 for문을 돌려서 0일 경우에는 flag를 true로 바꾼다.
        for (int i = 0; i < num; i++) {
            // 비교를 위해 값은 따로 받는다.
            int queuestack = Integer.parseInt(st.nextToken());

            if (queuestack == 0) {
                flag[i] = true;
            }
        }

        // 디큐를 만든다.
        Deque<Integer> deque = new ArrayDeque<>();
        // 값을 쪼개 받아야하니 다시 선언한다.
        st = new StringTokenizer(br.readLine());

        // for문을 다시 num만큼 돌려서 값을 추가한다.
        for (int i = 0; i < num; i++) {
            // 큐인 경우에만 값을 받아야하므로 따로 변수를 만들어 값을 미리 받는다.
            int questack = Integer.parseInt(st.nextToken());

            // flag가 true인 경우(큐)에만 값을 offerLast로 받아온다.
            // 입력값대로 들어와야하므로 offerLast로 받는다.
            if (flag[i] == true){
                deque.offerLast(questack);
            }
        }

        // 값을 추가할 개수를 받는다.
        int c = Integer.parseInt(br.readLine());
        
        // 쪼개야하니까 또 선언한다.
        st = new StringTokenizer(br.readLine());

        // 추가로 받을 자료구조의 개수만큼 for문을 돌린다.
        for (int i = 0; i < c; i++) {
            // 값은 따로 받는다.
            int queuestack = Integer.parseInt(st.nextToken());

            // 값들이 이동해야하므로 offerFirst - pollLast 한다.
            deque.offerFirst(queuestack);
            // sb.append(deque.pollLast()) 하지 않고 변수에 따로 담는다.
            int pl = deque.pollLast();

            // 출력한다.
            sb.append(pl).append(' ');
        }

        System.out.println(sb.toString());
    }
}