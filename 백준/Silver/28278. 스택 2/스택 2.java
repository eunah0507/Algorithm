import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

        // 명령대로 스택 구현하기

        // 명령대로 구현하기

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < num; i++) {
            int order = sc.nextInt();

            if (order == 1) {
                stack.add(sc.nextInt());
            } else if (order == 2 && stack.isEmpty()) {
                sb.append(-1);
                sb.append("\n");
            } else if (order == 2) {
                sb.append(stack.pop());
                sb.append("\n");
            } else if (order == 3) {
                sb.append(stack.size());
                sb.append("\n");
            } else if (order == 4) {
                if (stack.isEmpty()) {
                    sb.append(1);
                    sb.append("\n");
                } else {
                    sb.append(0);
                    sb.append("\n");
                }
            } else if (order == 5) {
                if (stack.size() >= 1) {
                    sb.append(stack.peek());
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