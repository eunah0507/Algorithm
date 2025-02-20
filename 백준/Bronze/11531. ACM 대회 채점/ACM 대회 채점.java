import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 문제명 -> [맞힌 시간, 틀린 횟수]
        Map<String, int[]> map = new HashMap<>();  
        // 맞힌 문제 개수
        int correctNum = 0;  
        // 총 페널티 시간
        int totalTime = 0;

        while (true) {
            String val = br.readLine();
            // 결산 처리
            if (val.equals("-1")) {  
                for (Map.Entry<String, int[]> entry : map.entrySet()) {
                    int[] result = entry.getValue();
                    // 해당 문제를 맞혔으면
                    if (result[0] != 0) {  
                        correctNum++;
                        totalTime += result[0] + result[1] * 20;
                    }
                }
                break;
            } else {
                String[] arr = val.split(" ");
                int time = Integer.parseInt(arr[0]);
                String problem = arr[1];
                String result = arr[2];

                // 현재 문제의 제출 로그 처리
                // 문제명이 없으면 [0, 0]으로 초기화
                map.putIfAbsent(problem, new int[2]);  
                int[] current = map.get(problem);

                if (result.equals("right") && current[0] == 0) {
                    current[0] = time;  // 맞힌 시간을 기록
                } else if (result.equals("wrong") && current[0] == 0) {
                    // 틀린 횟수 증가
                    current[1]++;  
                }
            }
        }

        sb.append(correctNum).append(" ").append(totalTime).append("\n");
        System.out.print(sb.toString()); 
    }
}
