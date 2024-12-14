import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        boolean check = false;
        int sum = 0;
        int bonus = 0;

        for (int i = 0; i < num; i++) {
            char c = str.charAt(i);
            if(!check){
                if(c == 'X'){
                    sum += 0;
                    bonus = 0;
                    check = false;
                } else if(c == 'O'){
                    sum += i + 1;
                    bonus++;
                    check = true;
                }
            } else{
                if(c == 'X'){
                    check = false;
                    sum += 0;
                    bonus = 0;
                } else if(c == 'O'){
                    sum += i + 1 + bonus;
                    bonus++;
                    check = true;
                }
            }
        }

        sb.append(sum).append("\n");
        System.out.println(sb.toString());
    }
}
