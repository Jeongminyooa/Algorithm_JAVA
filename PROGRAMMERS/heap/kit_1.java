package heap;

import java.util.PriorityQueue;

public class kit_1 {
	public int solution(int[] scoville, int K) {
        int answer = 0;
        
        //int형 priorityQueue 선언 (우선순위가 낮은 숫자 순)
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        // 힙(우선순위 큐)에 넣어줌.
        for(int sco : scoville) {
            heap.add(sco);
        }
        
        while(heap.peek() < K) {
            // 모든 음식이 K 이상으로 만들 수 없는 경우
            if(heap.size() == 1) {
                return -1;
            }
            // 스코빌 지수가 작은 2개의 음식
            int sco1 = heap.poll();
            int sco2 = heap.poll();
            
            heap.add(sco1 + (sco2 * 2));
            
            answer++;
        }
        return answer;
    }
}
