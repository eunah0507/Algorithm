import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        // 1번 풍선을 터뜨리고, 안에 들어있는 차례로 터뜨리기

        // 큐를 받아온다.
        // 풍선 안에 있는 값을 알아야한다.
        // 풍선의 순서를 알아야한다.
        // 두 가지의 값을 큐에 넣어야 하므로 클래스를 새로 만든다.

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num = Integer.parseInt(st.nextToken());
        Deque<Balloon> deque = new ArrayDeque<>();
        
        // 한 줄 끝나서 StringTokenizer가 끝났으므로 새로 받아온다.
        st = new StringTokenizer(br.readLine(), " ");
        
        // for문을 돌려서 deque 값을 추가한다.
        for (int i = 1; i <= num; i++) {
            deque.add(new Balloon(i, Integer.parseInt(st.nextToken())));
        }
        
        // while문을 돌려서 deque가 비게되면 자동으로 종료하게 한다.
        while (!deque.isEmpty()) {
            // 변수를 새로 만들어서 첫번째 값을 poll하고 출력한다.
            Balloon first = deque.pollFirst();
            sb.append(first.location);
            sb.append(" ");
            
            // 만일 deque가 하나 남았을 때 위 코드가 실행되어서 출력된 뒤,
            // deque가 비어있으면 종료. 
            if (deque.isEmpty()){
                break;
            }
            
            // first.value가 양수이면 오른쪽으로 값을 넘긴다.
            if (first.value > 0) {
                for (int i = 1; i < first.value ; i++) {
                    deque.offerLast(deque.pollFirst());
                }
            }else{
                // first.value가 음수이면 왼쪽으로 값을 넘긴다.
                // first.value가 음수이므로 Math.abs로 감싸서 절대값으로 출력
                for (int i = 1; i <= Math.abs(first.value); i++) {
                    deque.offerFirst(deque.pollLast());
                }
            }
        }

        System.out.println(sb.toString());
    }
    // 디큐가 받아와야할 데이터가 2개 이므로 클래스를 새로 만든다.
    public static class Balloon {
        int location = 0;
        int value = 0;
        
        //생성자를 만든다.
        public Balloon(int location, int value) {
            this.location = location;
            this.value = value;
        }
    }
}
