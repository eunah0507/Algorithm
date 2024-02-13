import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num = Integer.parseInt(st.nextToken());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();

            if (str.equals("push")) {
                deque.add(Integer.parseInt(st.nextToken()));
            } else if (str.equals("pop")) {
                if (deque.isEmpty()) {
                    sb.append(-1);
                    sb.append("\n");
                } else {
                    int pop = deque.pollFirst();
                    sb.append(pop);
                    sb.append("\n");
                }
            } else if (str.equals("size")) {
                sb.append(deque.size());
                sb.append("\n");
            } else if (str.equals("empty")) {
                if (deque.isEmpty()) {
                    sb.append(1);
                    sb.append("\n");
                } else {
                    sb.append(0);
                    sb.append("\n");
                }
            } else if (str.equals("front")) {
                if (!deque.isEmpty()) {
                    sb.append(deque.peekFirst());
                    sb.append("\n");
                } else {
                    sb.append(-1);
                    sb.append("\n");
                }
            } else if (str.equals("back")) {
                if (!deque.isEmpty()) {
                    sb.append(deque.peekLast());
                    sb.append("\n");
                } else {
                    sb.append(-1);
                    sb.append("\n");
                }
            }

        }

        System.out.println(sb.toString());

    }
}
