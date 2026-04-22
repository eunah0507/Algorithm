import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] inorder = new int[n];
        int[] postorder = new int[n];
        int[] idx = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            inorder[i] = Integer.parseInt(st.nextToken());
            idx[inorder[i]] = i;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            postorder[i] = Integer.parseInt(st.nextToken());
        }

        int[] inStartStack = new int[n];
        int[] inEndStack = new int[n];
        int[] postStartStack = new int[n];
        int[] postEndStack = new int[n];
        int top = 0;

        inStartStack[top] = 0;
        inEndStack[top] = n - 1;
        postStartStack[top] = 0;
        postEndStack[top] = n - 1;
        top++;

        while (top > 0) {
            top--;

            int inStart = inStartStack[top];
            int inEnd = inEndStack[top];
            int postStart = postStartStack[top];
            int postEnd = postEndStack[top];

            if (inStart > inEnd || postStart > postEnd) {
                continue;
            }

            int root = postorder[postEnd];
            sb.append(root).append(' ');

            int rootIdx = idx[root];
            int leftSize = rootIdx - inStart;
            int rightSize = inEnd - rootIdx;

            if (rightSize > 0) {
                inStartStack[top] = rootIdx + 1;
                inEndStack[top] = inEnd;
                postStartStack[top] = postStart + leftSize;
                postEndStack[top] = postEnd - 1;
                top++;
            }

            if (leftSize > 0) {
                inStartStack[top] = inStart;
                inEndStack[top] = rootIdx - 1;
                postStartStack[top] = postStart;
                postEndStack[top] = postStart + leftSize - 1;
                top++;
            }
        }

        System.out.print(sb.toString());
    }
}