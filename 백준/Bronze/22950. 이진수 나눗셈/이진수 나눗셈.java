import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String M = br.readLine();
        int K = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        boolean isPossible = true;

        for(char ch : M.toCharArray()){
            stack.push(ch);
        }

        for (int i = 0; i < K; i++) {
            if(stack.isEmpty()){
                break;
            }
            
            if(stack.pop() == '1'){
                isPossible = false;
                break;
            }
        }
        
        
        if (isPossible) {
            sb.append("YES");
        } else {
            sb.append("NO");
        }


        System.out.println(sb.toString());
    }
}