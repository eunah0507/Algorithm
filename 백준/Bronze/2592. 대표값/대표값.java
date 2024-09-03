import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(br.readLine());
            sum+=a;
            if (map.containsKey(a)) {
                int count = map.get(a) + 1;
                map.put(a, count);
            } else {
                map.put(a, 1);
            }
        }

        int times = 0;
        int answer = 0;
        for (int key :  map.keySet()) {
            int count = map.get(key);
            if(count > times){
                times = count;
                answer = key;
            }
        }
        
        System.out.println(sum/10);
        System.out.println(answer);
    }
}
