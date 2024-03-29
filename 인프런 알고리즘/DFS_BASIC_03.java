package DFS_BFS_BASIC;

class DFS_BASIC_03 {
    public int DFS(int n){
        if(n==1) return 1;
        else return n*DFS(n-1);
    }
    public static void main(String[] args){
        DFS_BASIC_03 T = new DFS_BASIC_03();
        System.out.println(T.DFS(5));
    }
}