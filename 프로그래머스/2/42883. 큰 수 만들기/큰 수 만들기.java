import java.util.*;

class Solution {
    public String solution(String number, int k) {
        int len = number.length();
        int remain = len - k; // 최종적으로 남아야 하는 숫자 개수
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < len; i++) {
            char c = number.charAt(i);

            // 스택이 비어있지 않고, 제거할 수 있으며, 스택의 top이 현재 숫자보다 작다면 pop
            while (!stack.isEmpty() && k > 0 && stack.peek() < c) {
                stack.pop();
                k--; // 하나 제거했으므로 k 감소
            }

            stack.push(c); // 현재 숫자를 스택에 추가
        }

        // 필요한 만큼 남기고 문자열로 변환
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < remain; i++) {
            sb.append(stack.get(i));
        }

        return sb.toString();
    }
}
