import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class HashMap_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int [] num = new int [n];
		
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		
		int answer = -1;
		int cnt = 0;
		
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				for (int l = j+1; l < n; l++) {
					Tset.add(num[i] + num[j] + num[l]);
				}
			}
		}
		
		for (Integer x : Tset) {
			cnt++;
			if (cnt == k) {
				answer = x;
				break;
			}
		}
		
		System.out.println(answer);
	}
}
