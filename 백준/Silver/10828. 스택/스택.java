import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num = Integer.parseInt(st.nextToken());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            String str = st.nextToken();

            if (str.equals("push")) {
                stack.add(Integer.parseInt(st.nextToken()));
            } else if (str.equals("pop")) {
                if (!stack.isEmpty()) {
                    int pop = stack.pop();
                    sb.append(pop);
                    sb.append("\n");
                } else {
                    sb.append(-1);
                    sb.append("\n");
                }
            } else if (str.equals("size")) {
                sb.append(stack.size());
                sb.append("\n");
            } else if (str.equals("empty")) {
                if (!stack.isEmpty()) {
                    sb.append(0);
                    sb.append("\n");
                } else {
                    sb.append(1);
                    sb.append("\n");
                }
            } else if (str.equals("top")) {
                if (!stack.isEmpty()) {
                    int top = stack.peek();
                    sb.append(top);
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
