package heap;

import java.util.PriorityQueue; 
import java.util.Arrays; 

public class kit_2 {
	public int solution(int[][] jobs) {
        int answer = 0;
        int now = 0;
        
        //int[]형 priorityQueue 선언 작업 시간순
        PriorityQueue<int[]> heap = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        // 작업 시작 시간순 정렬
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
        
        int i = 0;
        while(i < jobs.length || !heap.isEmpty()) {
            while(i < jobs.length && jobs[i][0] <= now) {
                heap.add(new int[] {jobs[i][0], jobs[i][1]});
                i++;
            }
            if(heap.isEmpty()) { //큐가 비어있다. -> 현재 실행할 수 있는 작업이 없다.
                now = jobs[i][0]; //다음 작업의 시작시간으로 이동한다.
            } else {
                int[] temp = heap.poll();
                answer += now + temp[1] - temp[0]; //요청 ~ 종료시간 
                now += temp[1];
            }
        }
        return answer / jobs.length;
    }
}
