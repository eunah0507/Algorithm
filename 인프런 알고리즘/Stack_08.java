import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Stack_08 {
static class Person{
		int id;
		int priority;
		public Person(int id, int priority) {
			this.id = id;
			this.priority = priority;
		}
	}
	
static class Bomin{
		public int solution(int n, int m, int [] arr) {
			int answer = 0;
			Queue<Person> Q = new LinkedList<>();
			
			for (int i = 0; i < n; i++) {
				Q.add(new Person(i, arr[i]));
			}
			
			while(!Q.isEmpty()) {
				Person tmp = Q.poll();
				for (Person x : Q) {
					if (x.priority > tmp.priority) {
						Q.add(tmp);
						tmp = null;
						break;
					}
				}
				
				if (tmp != null) {
					answer++;
					if (tmp.id == m) {
						return answer;
					}
				}
			}
			
			return answer;
		}
	}
	public static void main(String[] args) throws IOException{
		// M명의 환자 중, N번째 환자가 몇 번째로 진료받는지 구하는 문제
		
		// 1. 
		Bomin T = new Bomin();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n, m, arr));
	}
}
