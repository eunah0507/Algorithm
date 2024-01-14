package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_08_retry {
    public static class Person{
        int id;
        int risk;

        public Person(int id, int risk){
            this.id = id;
            this.risk = risk;
        }
    }

    public static class Patient{
        public static int Solution(int M, int N, int [] arr){
           int answer  = 0;
            Queue<Person> queue = new LinkedList<>();

            for (int i = 0; i < M; i++){
                queue.add(new Person(i, arr[i]));
            }

            while(!queue.isEmpty()){
                Person tmp = queue.poll();
                for (Person x: queue) {
                    if (x.risk > tmp.risk){
                        queue.add(tmp);
                        tmp = null;
                        break;
                    }
                }

                if (tmp != null) {
                    answer++;
                    if (tmp.id == N) {
                        return answer;
                    }
                }
            }
            return answer;
        }
    }
    public static void main(String[] args) {
        // M명의 환자 중, N번째 환자가 몇 번째로 진료받는지 구하는 문제

        // 1. 테스트케이스 int M,N을 받고 배열을 만들어 채운다.
        // 2. 환자값에 두개의 값이 들어가므로 class와 생성자를 만든다.
        // 3. 나머지 식을 전개하기 위한 class를 새로 만든다.
        // 4. queue를 만들고, 값이 2개 이므로 for문을 돌려 채운다.
        // 5. 맨 왼쪽에 있는 환자를 일단 poll하고 가장 위험한 환자인지 비교한다.
        // 6. 가장 위험한 환자가 아니라면 다시 맨오른쪽으로 add()한다.
        // 7. 가장 위험한 환자라면 그대로 poll()하고 answer++한다.
        // 8. 궁금해하던 환자의 순서가 몇번째인지 구한다.(그대로 answer을 return한다.)

        Patient patient = new Patient();
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        int [] arr = new int [M];

        for (int i = 0; i < M; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(patient.Solution(M, N, arr));

        sc.close();

    }
}
