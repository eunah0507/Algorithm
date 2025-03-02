import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // N: 전체 페이지 수 P: 선택된 페이지
        // 입력의 끝은 0이 주어진다

        // 1. while을 입력 받은 뒤, 0이 나오면 종료한다.
        // 2. List를 생성해서 1부터 2개씩 증가하면서 넣고
        //    마지막 수에서 2씩 빼면서 넣어준다.
        // 3. P가 그 수에 해당하면 break하고 출력한다.
        // 4. 없으면 지나간다.

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int totalPage = Integer.parseInt(st.nextToken());

            if (totalPage == 0) {
                break;
            }

            int choicePage = Integer.parseInt(st.nextToken());

            // 4페이지씩 묶어서 배열로 저장하기 위한 구조
            ArrayList<ArrayList<Integer>> pages = new ArrayList<>();

            int front = 1;
            int back = totalPage;

            // pages에 저장하기 위해 PageSet에 먼저 담고 보낸다.
            for (int i = 0; i < (totalPage / 4); i++) {
                ArrayList<Integer> pageSet = new ArrayList<>();

                pageSet.add(front++);
                pageSet.add(back--);

                pageSet.add(front++);;
                pageSet.add(back--);

                pages.add(pageSet);
            }

            for (ArrayList<Integer> page : pages) {
                if (page.contains(choicePage)){
                    Collections.sort(page);
                    page.remove(Integer.valueOf(choicePage));
                    for (Integer i : page) {
                        sb.append(i).append(" ");
                    }
                    sb.append("\n");
                    break;
                }
            }
        }

        System.out.println(sb.toString());
    }
}
