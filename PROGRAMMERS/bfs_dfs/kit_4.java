package bfs_dfs;

import java.util.*;
class kit_4 {
    static int minCnt = 1000;
    ArrayList<String> allCase = new ArrayList<String>();
    public String[] solution(String[][] tickets) {
        
        boolean[] visited = new boolean[tickets.length];
        
        // 출발은 항상 ICN
        dfs(tickets, visited, 0, "ICN", "");
        
        // 가능 경로가 2개 이상인 경우 알파벳 순서로 정렬
        Collections.sort(allCase);        
        String[] answer = allCase.get(0).split(",");
        
        return answer;
    }
    
    public void dfs(String[][] tickets, boolean[] visited, int cnt, String start, String list) {
        if(cnt == tickets.length) {
            // 가능 경로가 2개 이상인 경우를 위해 넣어줌.
            allCase.add(list + start);
            return;
        }
        
        for(int i = 0; i < tickets.length; i++) {
            String startNow = tickets[i][0];
            String targetNow = tickets[i][1];
            
            if(startNow.equals(start) && !visited[i]) {
                visited[i] = true;
                dfs(tickets, visited, cnt + 1, targetNow, (list + startNow + ",")); 
                visited[i] = false;
            } 
        }
    }
}