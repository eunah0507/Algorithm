import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        char op = ' ';
        while (true){
            String next = br.readLine();

            if(next.charAt(0) == '='){
                System.out.println(num);
                break;
            }

            switch (next.charAt(0)){
                case '+':
                case '-':
                case '*':
                case '/':
                    op=next.charAt(0);
                    break;
                default:
                {
                    switch (op){
                        case '+':
                            num += Integer.parseInt(next);
                            break;
                        case '-':
                            num -= Integer.parseInt(next);
                            break;
                        case '*':
                            num *= Integer.parseInt(next);
                            break;
                        case '/':
                            num /= Integer.parseInt(next);
                            break;
                    }
                    break;
                }

            }
        }
    }
}
