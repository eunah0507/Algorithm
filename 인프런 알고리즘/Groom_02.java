package Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Groom_02 extends Exception {
    public static class Student {
        // 중간성적, 최종성적, 평균, 학생의 순서
        public int middle,fin,average,order;
        public Student(int middle,int fin,int average,int order){
            this.middle = middle;
            this.fin = fin;
            this.average = average;
            this.order = order;
        }
    }
    public static void main(String[] args) throws IOException {
        // N명의 학생 중, K등의 학생이 몇 번째인지 출력
        // N명의 학생은 각각 중간, 최종 성적이 나오고 > 평균
        // 평균이 같을 경우, 최종 성적이 낮은 학생이 더 높은 등수를 가짐
        // 6 4 / 10 5 / 7 4 / 6 11 /
        /*
6 4
10 5
7 4
6 11
1 2
0 0
0 0
        * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // 각 학생의 정보로 배열을 만들었다.
        Student[] student = new Student[num];

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            int middle = Integer.parseInt(st.nextToken());
            int fin = Integer.parseInt(st.nextToken());
            int average = (middle + fin) / 2;
            int order = i+1;
            student[i] = new Student(middle,fin,average,order);
        }

        Arrays.sort(student, (student1,student2) -> {
            if (student1.average < student2.average){
                return 1;
            }else if(student1.average > student2.average){
                return 0;
            }else if(student1.average == student2.average){
                if(student1.fin < student2.fin){
                    return 1;
                }else {
                    return 0;
                }
            }
            return 0;
        });//6 7 34 65 2 // 65 34  7 6 2

        sb.append(student[k].order);
        System.out.println(sb.toString());

    }
}