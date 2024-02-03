import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 간격을 같게 하는 최소수 구하기

        // 테스트케이스를 for문을 돌려 받아온다.
        // 모든 간격을 List에 넣는다.
        // 첫 번째 간격의 최대 공약수를 저장한다.
        // for문을 돌면서 두 번째 간격부터 저장했던 간격과 최대공약수를 구한다.
        // 마지막 나무와 첫 번째 나무사이의 간격을 구한다.
        // 그 간격을 최대 공약수로 나누고, 심어져 있는 나무의 갯수 -2 값을 뺀다.
        // 심어져 있는 나무의 갯수 -2 하는 이유 : 첫 번째 나무와 마지막 나무 제외
        // 값을 출력한다.

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        int [] streetTree = new int [num];

        for (int i = 0; i < num; i++) {
            streetTree[i] = sc.nextInt();
        }

        int gcd = 0;

        for (int i = 0; i < num - 1; i++) {
            int distance = streetTree[i+1] - streetTree[i];
            gcd = uclid(distance, gcd);
        }

        int answer = ((streetTree[num - 1] - streetTree[0]) / gcd) + 1 - (streetTree.length);

        sb.append(answer);
        System.out.println(answer);
    }

    public  static int uclid(int a , int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }
}