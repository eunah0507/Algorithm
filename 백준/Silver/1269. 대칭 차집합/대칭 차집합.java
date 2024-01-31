import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 두 집합의 대칭차집합의 갯수를 구하는 문제

        // 두 개를 TreeSet으로 받는다.
        // 겹치는 것을 List로 뺀다. 그 후, List의 size()를 출력한다.
        // 각 TreeSet.size() - List.size() 한다.

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int A = sc.nextInt();
        int B = sc.nextInt();

        Set<Integer> Aset = new TreeSet<>();
        Set<Integer> Bset = new TreeSet<>();
        int answer = 0;

        for (int i = 0; i < A; i++) {
            Aset.add(sc.nextInt());
        }

        for (int i = 0; i < B; i++) {
            Bset.add(sc.nextInt());
        }

        List<Integer> compare = new ArrayList<>();
        int compareSize = 0;

        for (Integer integer : Aset) {
            if (Bset.contains(integer)){
                compare.add(integer);
            }
        }

        compareSize = compare.size();
        answer = (Aset.size()-compareSize) + (Bset.size()-compareSize);

        sb.append(answer);
        System.out.println(sb.toString());
    }
}