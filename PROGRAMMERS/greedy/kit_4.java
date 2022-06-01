package greedy;

import java.util.Arrays;

public class kit_4 {

	// 구명보트
	public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        int firstIndex = 0; // 몸무게 적은 사람
        int lastIndex = people.length - 1; // 몸무게가 많은 사람 
        
        // 최소한의 횟수 -> 몸무게 큰 사람 + 적은 사람 조합
        while(firstIndex <= lastIndex) {
            if(firstIndex == lastIndex) {
                // 인덱스가 같다면 더해지지 않은 경우이므로 카운트만
                answer++;
                break;
            }
            int sum = people[firstIndex] + people[lastIndex];
            
            // 합이 limit보다 작다면
            if(sum <= limit) {
                firstIndex++;
                lastIndex--;
                answer++;
            } else {
                // 합이 더 크다면 큰 수는 합하지 않음
                lastIndex--;
                answer++;
            }
            
        }
        
        return answer;
    }
}
