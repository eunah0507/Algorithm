package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Stack_05 {
    public static void main(String[] args) {

        // 쇠막대기가 레이저에 닿아 몇 조각으로 나뉘었는지 구하는 문제

        // 1. 테스트케이스 String을 만든다.
        // 2. 답을 출력할 answer 변수를 만든다.
        // 3. Stack을 만든다.
        // 4. for문안에 if문을 돌려서 '('를 만나면 add한다.
        // 5. 그게 아니라면 pop()한다.
        // 5-1. 다시 if문을 써서 바로 앞에 add한게 (면 answer에 stack.size()중첩한다.
        // 5-2. 그게 아니면 그냥 쇠막대기가 끝난거니까 answer++한다.

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int answer = 0;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '('){
                stack.add('(');
            }else{
                stack.pop();
                if (str.charAt(i - 1) == '('){
                    answer += stack.size();
                }else{
                    answer++;
                }
            }

        }

        System.out.println(answer);
    }
}
