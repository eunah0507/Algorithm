import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 디큐 구현문제

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int order = Integer.parseInt(st.nextToken());

            if (order == 1){
                deque.offerFirst(Integer.parseInt(st.nextToken()));
            }else if(order == 2){
                deque.offerLast(Integer.parseInt(st.nextToken()));
            }else if(order == 3){
                if (!deque.isEmpty()){
                    sb.append(deque.pollFirst());
                    sb.append("\n");
                }else{
                    sb.append(-1);
                    sb.append("\n");
                }
            }else if(order == 4){
                if (!deque.isEmpty()){
                    sb.append(deque.pollLast());
                    sb.append("\n");
                }else{
                    sb.append(-1);
                    sb.append("\n");
                }
            }else if(order == 5){
                sb.append(deque.size());
                sb.append("\n");
            }else if(order == 6){
                if (deque.isEmpty()){
                    sb.append(1);
                    sb.append("\n");
                }else{
                    sb.append(0);
                    sb.append("\n");
                }
            }else if(order == 7){
                if (!deque.isEmpty()){
                    sb.append(deque.peekFirst());
                    sb.append("\n");
                }else{
                    sb.append(-1);
                    sb.append("\n");
                }
            }else if(order == 8){
                if (!deque.isEmpty()){
                    sb.append(deque.peekLast());
                    sb.append("\n");
                }else{
                    sb.append(-1);
                    sb.append("\n");
                }
            }
        }

        System.out.println(sb.toString());
    }
}
