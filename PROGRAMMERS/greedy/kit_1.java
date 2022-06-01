package greedy;

import java.util.Arrays;

public class kit_1 {

	// 체육복
	 public int solution(int n, int[] lost, int[] reserve) {
	        int answer = n - lost.length; // 4
	        
	        Arrays.sort(lost);
	        Arrays.sort(reserve);
	        
	        // 자신이 분실한 경우
	        for(int i=0; i < lost.length; i++) {
	            for(int j=0; j < reserve.length; j++) {
	                if(lost[i] == reserve[j]) {
	                    lost[i] = -1;
	                    reserve[j] = -1;
	                    answer++;
	                    break;
	                }
	            }
	        }
	        
	        for(int i = 0; i < lost.length; i++) {
	            for(int j = 0; j < reserve.length; j++) {
	                if(reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1) {
	                    answer++;
	                    reserve[j] = -1;
	                    break;
	                }
	                if(reserve[j] == lost[i]) {
	                    break;
	                }
	            }
	            
	        }
	        return answer;
	    }
	 
}
