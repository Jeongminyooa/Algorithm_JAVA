package sort;

import java.util.Arrays;

public class kit_1 {
	 public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];
	        
	        // command[i][0] : 시작 idx
	        // command[i][1] : 끝 idx
	        // command[i][2] : 확인할 순서
	        for(int i = 0; i < commands.length; i++) {
	            // 복사할 idx 범위 : 0 ~ n
	            int startIdx = commands[i][0] - 1;
	            int endIdx = commands[i][1]; 
	            
	            int[] temp = Arrays.copyOfRange(array, startIdx, endIdx);
	            // 복사한 array 정렬
	            Arrays.sort(temp);
	            answer[i] = temp[commands[i][2] - 1];
	        }
	        return answer;
	    }
}
