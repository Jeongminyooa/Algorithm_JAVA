package graph;

import java.util.*;
class kit_3 {
     class Node{
        int x;
        int y;
        
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        
        public boolean equals(Object o) {
            return this.x == ((Node) o).x && this.y == ((Node) o).y;
        }
    }
    public int solution(int[] arrows) {
       int answer = 0;
        
        int[] dx = {-1, -1, 0, 1, 1,  1,  0, -1};
        int[] dy = { 0,  1, 1, 1, 0, -1, -1, -1};
        
        HashMap<Node, ArrayList<Node>> v = new HashMap<>();
        
        // 0, 0 생성
        Node start = new Node(0, 0);
        v.put(start, makeEdgeList(start));
        
        // 연결 정보 넣어주기
        for(int arrow : arrows) {
            
            // 교차점 처리??
            for(int i  = 0; i<=1 ; i++) {
                Node next = new Node(start.x + dx[arrow], start.y + dy[arrow]);
                
                // 첫방문
                if(!v.containsKey(next)) {
                    v.put(next, makeEdgeList(start));
                    v.get(start).add(next);
                }
                // 재방문했고 간선을 처음 통과하는 경우
                else if(v.containsKey(next)
                        && !v.get(next).contains(start)) {
                    
                    // 간선 방문
                    v.get(next).add(start);
                    v.get(start).add(next);
                    answer++;
                }
                start = next;
            }
            
        }
        
        return answer;
    }
    public ArrayList<Node> makeEdgeList(Node parm){
        ArrayList<Node> edge = new ArrayList<>();
        edge.add(parm);
        return edge;
    }
}