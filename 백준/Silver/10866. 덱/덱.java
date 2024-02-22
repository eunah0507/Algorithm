import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if (str.equals("push_front")) {
                deque.offerFirst(Integer.parseInt(st.nextToken()));
            }else if(str.equals("push_back")){
                deque.offerLast(Integer.parseInt(st.nextToken()));
            }else if (str.equals("pop_front")){
                if (!deque.isEmpty()){
                    sb.append(deque.pollFirst()).append("\n");
                }else {
                    sb.append(-1).append("\n");
                }
            }else if(str.equals("pop_back")){
                if (!deque.isEmpty()){
                    sb.append(deque.pollLast()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }else if(str.equals("size")){
                sb.append(deque.size()).append("\n");
            }else if(str.equals("empty")){
                if (deque.isEmpty()){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }else if(str.equals("front")){
                if (!deque.isEmpty()){
                    sb.append(deque.peekFirst()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            } else if (str.equals("back")) {
                if (!deque.isEmpty()){
                    sb.append(deque.peekLast()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }
        }

        System.out.println(sb.toString());
    }
}