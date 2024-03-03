import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if (str.equals("add")){
                int number = Integer.parseInt(st.nextToken());
                if (!set.contains(number)){
                    set.add(number);
                }
            }else if(str.equals("remove")){
                int number = Integer.parseInt(st.nextToken());
                if (set.contains(number)){
                    set.remove(number);
                }
            }else if(str.equals("check")){
                if (set.contains(Integer.parseInt(st.nextToken()))){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }else if(str.equals("toggle")){
                int number = Integer.parseInt(st.nextToken());
                if (set.contains(number)){
                    set.remove(number);
                }else{
                    set.add(number);
                }
            }else if(str.equals("all")){
                for (int j = 1; j <= 20; j++) {
                    set.add(j);
                }
            }else if(str.equals("empty")){
                set.clear();
            }
        }

        System.out.println(sb.toString());
    }
}