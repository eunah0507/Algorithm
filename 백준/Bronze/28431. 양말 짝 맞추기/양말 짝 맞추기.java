import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int socks = 5;

        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < socks; i++) {
            int nextSocks = Integer.parseInt(br.readLine());

            if (set.contains(nextSocks)) {
                set.remove(nextSocks);
            }else{
                set.add(nextSocks);
            }
        }

        for (Integer integer : set) {
            sb.append(integer);
        }
        System.out.println(sb.toString());
    }
}