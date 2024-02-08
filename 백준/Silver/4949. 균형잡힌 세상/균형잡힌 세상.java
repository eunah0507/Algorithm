import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

        // ( ) 짝이 맞는지, [ ] 짝이 맞는지
        // 맞으면 yes 아니면 no 출력

        // while문 안에서 테스트케이스를 입력받는다.
        // while문의 조건으로 . 하나만 입력받으면 break된다.
        // stack을 만든다.
        // for문을 돌려서 문자 하나씩 뺀다.
        // '(' 나 '['면 add한다.
        // ')'인데 stack.isEmpty()면 no 출력 후 break;
        // ')' 면 stack.peek() == '('면 pop한다.
        // ')'인데 stack.peek() != '('면 바로 no 출력 후 break;
        // '['도 위와 동일하게 적용한다.

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while(true){
            Stack<Character> stack = new Stack<>();
            String str = sc.nextLine();
            boolean flag = true;

            if (str.charAt(0) == '.'){
                break;
            }else{
                for (int i = 0; i < str.length(); i++) {
                    char word = str.charAt(i);

                    if (word == '(' || word == '['){
                        stack.add(word);
                    }else if(word == ')' && stack.isEmpty()){
                        sb.append("no");
                        sb.append("\n");
                        flag = false;
                        break;
                    }else if (word == ')' && stack.peek() == '('){
                        stack.pop();
                    }else if(word == ')' && stack.peek() != '('){
                        sb.append("no");
                        sb.append("\n");
                        flag = false;
                        break;
                    }else if(word == ']' && stack.isEmpty()){
                        sb.append("no");
                        sb.append("\n");
                        flag = false;
                        break;
                    }else if(word == ']' && stack.peek() == '['){
                        stack.pop();
                    }else if(word == ']' && stack.peek() != '['){
                        sb.append("no");
                        sb.append("\n");
                        flag = false;
                        break;
                    }
                }

                if (stack.isEmpty() && flag == true){
                    sb.append("yes");
                    sb.append("\n");
                }else if(!stack.isEmpty() && flag == true){
                    sb.append("no");
                    sb.append("\n");
                }
            }
        }

        System.out.println(sb.toString());
    }
}
