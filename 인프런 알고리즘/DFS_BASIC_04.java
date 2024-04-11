package DFS_BFS_BASIC;

class DFS_BASIC_04 {
    public int DFS(int n){
        if(n==1) return 1;
        else if(n==2) return 1;
        else return DFS(n-2)+DFS(n-1);
    }
    public static void main(String[] args){
        DFS_BASIC_04 T = new DFS_BASIC_04();
        int n=10;
        for(int i=1; i<=n; i++) System.out.print(T.DFS(i)+" ");
    }
}
