import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    static class TrieNode {
        Map<String, TrieNode> childNode = new HashMap<>();

        TrieNode() {
        }

        public void insert(String inputString) {
            TrieNode currentNode = this;
            String[] strArray = inputString.split(",");
            for (String s : strArray) {
                currentNode.childNode.putIfAbsent(s, new TrieNode());
                currentNode = currentNode.childNode.get(s);
            }
        }

        public void print(TrieNode curNode, int depth) {
            TrieNode currentNode = curNode;
            if (currentNode.childNode != null) {
                List<String> sortedKeys = new ArrayList<>(currentNode.childNode.keySet());
                Collections.sort(sortedKeys);
                for (String key : sortedKeys) {
                    for (int i = 0; i < depth; i++) {
                        System.out.print("--");
                    }
                    System.out.println(key);
                    print(currentNode.childNode.get(key), depth + 1);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        TrieNode trie = new TrieNode();
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int k = Integer.parseInt(input[0]);

            StringBuilder sb = new StringBuilder();
            for (int j = 1; j < k + 1; j++) {
                sb.append(input[j]).append(",");
            }

            trie.insert(sb.toString());
        }

        trie.print(trie, 0);
    }
}
