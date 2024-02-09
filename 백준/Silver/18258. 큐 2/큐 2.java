import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 큐 구현문제

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();

            if (str.equals("push")){
                int number = Integer.parseInt(st.nextToken());
                queue.offer(number);
            }else if(str.equals("pop")){
                if (queue.isEmpty()){
                    sb.append(-1);
                    sb.append("\n");
                }else{
                    sb.append(queue.poll());
                    sb.append("\n");
                }
            }else if(str.equals("size")){
                    sb.append(queue.size());
                    sb.append("\n");
            }else if(str.equals("empty")){
                if (queue.isEmpty()){
                    sb.append(1);
                    sb.append("\n");
                }else{
                    sb.append(0);
                    sb.append("\n");
                }
            }else if(str.equals("front")){
                if (!queue.isEmpty()){
                    sb.append(queue.peekFirst());
                    sb.append("\n");
                }else{
                    sb.append(-1);
                    sb.append("\n");
                }
            }else if(str.equals("back")){
                if (!queue.isEmpty()){
                    sb.append(queue.peekLast());
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
