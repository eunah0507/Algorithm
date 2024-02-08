import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

        // 올바른 괄호 문자열이면 Yes, 아니면 no 출력하기

        // 테스트케이스를 받는다.
        // for문 안에 stack을 만들고 돌려서 입력값을 하나씩 추가한다.
        // '('이면 add한다.
        // ')'이면 '('를 pop한다.
        // 모든 입력값을 받은 후, isEmpty()를 사용해서 답을 출력한다.
        // 이후, 다음 입력값을 받으므로 stack은 초기화 되어있다.
        
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            Stack<Character> stack = new Stack<>();
            String str = sc.next();
            boolean flag = true;

            for (int j = 0; j < str.length(); j++) {
                char word = str.charAt(j);

                if (word == '(') {
                    stack.add(word);
                } else if (word == ')' && !stack.isEmpty()) {
                    stack.pop();
                } else if (word == ')' && stack.isEmpty()) {
                    sb.append("NO");
                    sb.append("\n");
                    flag = false;
                    break;
                }
            }

            if (stack.isEmpty() && flag == true) {
                sb.append("YES");
                sb.append("\n");
            } else if (flag == true) {
                sb.append("NO");
                sb.append("\n");
            }


        }

        System.out.println(sb.toString());


    }
}