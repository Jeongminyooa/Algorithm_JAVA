package binary_search;

import java.util.*;

public class kit_1 {
	public long solution(int n, int[] times) {
        long answer = Long.MAX_VALUE;
        
        // 이분탐색 조건 : 정렬 
        Arrays.sort(times);
        
        // 0부터 최대 입국 심사 대기 시간 범위 내에서 이분 탐색
        // target : n
        long left = 0;
        long right = (long)n * times[times.length - 1];
        long mid = 0;
        long cnt = 0;
        
        while(left <= right) {
            mid = (left + right) / 2;
            cnt = 0;
            for(int t : times) {
                // 30 / 7  = 4, 30/ 10 = 3
                cnt += mid / t;
            }
            
            // 검사를 했는지 여부에 따라 범위 재조절 
            if(cnt >= n) {
                answer = Math.min(answer, mid);
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return answer;
    }
}
