import java.util.HashMap;
import java.util.Scanner;

public class HashMap_04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		int answer = 0;
		
		HashMap<Character, Integer> aMap = new HashMap<>();
		HashMap<Character, Integer> bMap = new HashMap<>();
		
		for (char ch : b.toCharArray()) {
			bMap.put(ch, bMap.getOrDefault(ch, 0)+1);
		}
		
		int L = b.length()-1;
		
		for (int i = 0; i < L; i++) {
			aMap.put(a.charAt(i), aMap.getOrDefault(a.charAt(i), 0)+1);
		}
		
		int lt = 0;
		
		for (int rt = L; rt < a.length(); rt++) {
			aMap.put(a.charAt(rt), aMap.getOrDefault(a.charAt(rt), 0)+1);
			if (aMap.equals(bMap)) {
				answer++;
			}
			
			aMap.put(a.charAt(lt), aMap.get(a.charAt(lt))-1);
			
			if (aMap.get(a.charAt(lt)) == 0) {
				aMap.remove(a.charAt(lt));
			}
			lt++;
		}
		System.out.println(answer);
	}
}
