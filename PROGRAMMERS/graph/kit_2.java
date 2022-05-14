package graph;

import java.util.*;

class kit_2 {
    public int solution(int n, int[][] results) {
        int answer = 0;
        order = new LinkedList[n];
        reverse = new LinkedList[n];

        for(int i = 0; i < order.length; i++) {
            order[i] = new LinkedList<>();
            reverse[i] = new LinkedList<>();
        }
        for(int i = 0; i < results.length ; i++) {
            int win = results[i][0]-1;
            int lose = results[i][1]-1;
            order[lose].add(win);
            reverse[win].add(lose);
        }

        for(int i = 0; i < n; i++) {
            int sum = 0;
            count = 0;
            visited = new boolean[n];
            explore(i, order);
            sum = count;
            count = 0;
            visited = new boolean[n];
            explore(i, reverse);
            sum+=count;

            if(sum == n-1) answer++;

        }
        return answer;
    }
    
    
    boolean[] visited;
    List<Integer>[] order;
    List<Integer>[] reverse;
    int count;

    private void explore(int v,List<Integer>[] graph) {

        visited[v] = true;
        for(int adj : graph[v]){
            if(!visited[adj]){
                count++;
                explore(adj,graph);
            }
        }
    }
}
