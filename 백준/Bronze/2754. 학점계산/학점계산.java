import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // A학생의 평점 구하기 문제

        // if - else if 문을 사용해서 학점을 구한다.
        // HashMap으로 풀어보자.. 칷!!!!!

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String str = sc.next();
        Map<String, Double> score = new HashMap<>();

        score.put("A+", 4.3);
        score.put("A0", 4.0);
        score.put("A-", 3.7);
        score.put("B+", 3.3);
        score.put("B0", 3.0);
        score.put("B-", 2.7);
        score.put("C+", 2.3);
        score.put("C0", 2.0);
        score.put("C-", 1.7);
        score.put("D+", 1.3);
        score.put("D0", 1.0);
        score.put("D-", 0.7);
        score.put("F", 0.0);

        Double answer = score.get(str);

        System.out.println(answer);
    }
}