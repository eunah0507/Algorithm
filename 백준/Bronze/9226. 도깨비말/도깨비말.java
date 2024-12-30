import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            Deque<Character> deque = new ArrayDeque<>();

            String str = br.readLine();
            String remain = "";

            if (str.equals("#")) {
                break;
            } else {
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                        remain = str.substring(i);
                        break;
                    }else{
                        deque.addLast(str.charAt(i));
                    }
                }
            }

            sb.append(remain);
            
            while (!deque.isEmpty()){
                sb.append(deque.pollFirst());
            }

            sb.append("ay").append("\n");
        }

        System.out.println(sb.toString());
    }
}
