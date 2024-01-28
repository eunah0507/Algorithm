import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 입력받은 좌표들 내림차순으로 순위 매기기
        // 같은 숫자일 때는 공동 순위로 한다.

        // 이 문제에는 입력받을 무언가와 복사본이 필요하다.
        // 그러므로 TreeMap과 배열을 사용한다.
        // for문을 돌려 배열에 값을 받아오고, 그 값을 TreeMap의 key값으로 복사한다.
        // TreeMap은 이미 오름차순 정렬되었으므로 조건문을 사용해 value값을 순서대로 넣어준다.
        // 조건문의 경우, value를 순차적으로 증가시킬 index를 TreeMap에 put(key, index)한다.
        // 단, key갑이 같을 경우를 대비하여 변수를 하나 더 설정하고 이전 값과 같을 경우 index를 증가시키지 않는다.
        // 일반 for문을 돌려 배열에 TreeMap의 key값과 일치하다면 그 공간에 value로 대체한다.
        // forEach문은 배열의 특정 위치에 값을 넣을 수 없으므로 일반 for문을 사용한다.
        // forEach문을 사용할 경우 key나 value값만 넣을 수 있어서.. copy의 위치를 알 수 없다.

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        int [] copy = new int [num];
        Map <Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < num; i++) {
            copy[i] = sc.nextInt();
            map.put(copy[i], 0);
        }

        // TreeMap이라서 이미 오름차순 정렬 되어있음.
        // 정렬된 차례에 따라 Value값을 넣어줘야함
        int index = -1;
        int front = Integer.MAX_VALUE;
        for (Integer integer : map.keySet()) {
            if (front != integer){
                index++;
                front = integer;
            }
            map.put(integer, index);
        }

        // map.get(key) == key의 value값을 가져온다.
        for (int i = 0; i < num; i++) {
            copy[i] = map.get(copy[i]);
            sb.append(copy[i] + " ");
        }

        System.out.println(sb.toString());
    }
}