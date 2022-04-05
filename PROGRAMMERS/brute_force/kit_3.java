package brute_force;

public class kit_3 {
	 public int[] solution(int brown, int yellow) {
	        int x = yellow + 2; // 가로칸 최대 개수
	        int y = 3; // 세로칸 최소 개수
	        int assume = x * y; //x와 y에 맞는 카펫 격자 개수
	        int total = brown + yellow; // 전체 카펫 격자 개수
	        
	        int y_plus = 1;
	        
	        while(x > y) {
	            if(assume == total)
	                break;
	            
	            yellow /= 2;
	            x -= yellow;
	            y += y_plus;
	            y_plus *= 2;
	            
	            assume = x * y;
	        }
	        if(assume != total) {
	             x = 0;
	             y = 0;
	        }
	        int[] answer = new int[] {x, y};
	        
	        return answer;
	    }
}
