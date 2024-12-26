import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int roomWidth = Integer.parseInt(st.nextToken()); 
        int partitionCount = Integer.parseInt(st.nextToken()); 

        boolean[] possibleWidths = new boolean[roomWidth + 1]; 
        List<Integer> partitionPositions = new ArrayList<>(partitionCount + 2);
        
        partitionPositions.add(0);
        partitionPositions.add(roomWidth); 
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < partitionCount; i++) {
            int partition = Integer.parseInt(st.nextToken());
            for (int pos : partitionPositions) {
                possibleWidths[Math.abs(partition - pos)] = true; 
            }
            partitionPositions.add(partition); 
        }

        for (int i = 1; i <= roomWidth; i++) {
            if (possibleWidths[i]) {
                sb.append(i).append(' ');
            }
        }
        sb.append(roomWidth); 
        
        System.out.println(sb.toString()); 
    }
}
