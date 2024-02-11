import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        // 승환이가 간식을 받을 수 있다면 Nice, 아니면 Sad 출력하기

        // 테스트케이스 받고, Stack만든다.
        // for문을 돌려서
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Stack<Integer> stack = new Stack<>();
        int count = 1;

        for (int i = 1; i <= num; i++) {
            int turn = Integer.parseInt(st.nextToken());

            if (count == turn) {
                count++;
            } else if (!stack.isEmpty() && stack.peek() == count) {
                while (true) {
                    if (stack.size() == 0) {
                        break;
                    } else {
                        int order = stack.peek();

                        if (order == count) {
                            stack.pop();
                            count++;
                        } else {
                            break;
                        }
                    }
                }
                
                stack.add(turn);
            } else {
                stack.add(turn);
            }
        }

        while (true) {
            if (stack.size() == 0) {
                break;
            } else {
                int order = stack.peek();

                if (order == count) {
                    stack.pop();
                    count++;
                } else {
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            sb.append("Sad");
        } else {
            sb.append("Nice");
        }

        System.out.println(sb.toString());
    }
}
