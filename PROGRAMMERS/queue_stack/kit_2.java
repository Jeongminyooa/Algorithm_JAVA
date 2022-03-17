package queue_stack;
import java.util.Queue;
import java.util.LinkedList;

public class kit_2 {
	// 프린터 
	class Print {
        int loc;
        int prior;
        public Print(int loc, int prior) {
            this.loc = loc;
            this.prior = prior;
        }
    }
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Print> queue = new LinkedList<>();
        
        for(int i = 0; i < priorities.length; i++) {
            // 큐 <- 목록 순서와 중요도
            queue.add(new Print(i, priorities[i]));
        }
        
        while(!queue.isEmpty()) {
            Print p = queue.poll();
            boolean flag = false;
            for(Print q : queue) {
                // 현재 작업 보다 우선순위가 높은 작업이 있다면
                if(p.prior < q.prior) {
                    flag = true;
                }
            }
            if(flag) {
                queue.add(p); // 뒤로 넣어줌
            } else {
                answer++;
                // 지금 작업이 찾는 로케이션이라면
                if(location == p.loc) {
                    return answer;
                }
            }
        }
        
        return answer;
    }
}
