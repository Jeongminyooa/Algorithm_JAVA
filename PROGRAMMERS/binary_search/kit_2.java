package binary_search;
import java.util.*;

public class kit_2 {
	public int solution(int distance, int[] rocks, int n) {
        int answer = 0;
        
        Arrays.sort(rocks);
        
        // 시간의 최댓값을 찾기 위해 이분탐색 사용.
        int left = 1;
        int right = distance;
        int mid = 0;
        int before = 0; // 이전 바위 : 거리 계산
        int remove = 0;
        
        while(left <= right) {
            // 최솟값이라 가정 -> 최댓값 찾기 위해
            mid = (left + right) / 2;
            
            for(int i = 0; i < rocks.length; i++) {
                // 1) 이전 바위와의 거리를 구한다.
                int length = rocks[i] - before;
                
                // 2) 그 거리가 최솟값보다 작다면 삭제
                if(length < mid) {
                    remove++;
                } else {
                    // 3) 최솟값보다 크다면 삭제하지 않고, 이전돌 위치 재조정
                    before = rocks[i];
                }
            }
            // for문에서 마지막 돌에서 도착지까지의 거리를 구하지 않았기에 구해줌!
            if(distance-before < mid) {
                remove++;
            }
            
            
            // 5) 삭제한 돌 개수와 n과 비교
            if(remove > n) {
                // 6) n보다 크다면 최솟값이 너무 큰 것
                right = mid - 1;
            } else {
                // 7) n보다 작다면 최솟값이 너무 작은 것
                left = mid + 1;
                // 최댓값
                answer = Math.max(answer, mid);
            }
            remove = 0;
            before = 0;
        }
        
        return answer;
    }
}
