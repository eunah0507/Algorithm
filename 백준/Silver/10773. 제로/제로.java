import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

        // 스택으로 풀되, 0 나오면 이전에 들어간 숫자 제거하기
        // 총 남은 수의 합을 구하라

        // 테스트케이스를 입력받는다
        // stack을 만들어둔다.
        // for문을 돌려서 조건문을 건다
        // 0이 아닌 숫자면 추가한다
        // 0이면 이전 숫자를 제거한다.
        // 남은 수의 총 합을 출력한다.

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int i = 0; i < num; i++) {
            int k = sc.nextInt();

            if (k != 0){
                stack.add(k);
            }else{
                stack.pop();
            }
        }

        for (Integer integer : stack) {
            if (!stack.isEmpty()){
                answer += integer;
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}