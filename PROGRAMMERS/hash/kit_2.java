package hash;
import java.util.Map;
import java.util.HashMap;

public class kit_2 {
	// 전화번호 목록 
	 public boolean solution(String[] phone_book) {
	        boolean answer = true;
	        Map<String, Integer> map = new HashMap<String, Integer>();
	        
	        // 맵에 모든 전화번호를 넣어준다.
	        for(String p : phone_book) {
	            map.put(p, 0);
	        }
	        
	        // 모든 전화번호의 subString을 맵과 비교해본다.
	        for(int i = 0; i < phone_book.length; i++) {
	            for(int j = 0; j < phone_book[i].length(); j++) {
	                if(map.containsKey(phone_book[i].substring(0, j)))
	                    answer = false;
	            }
	        }
	       
	        return answer;
	    }
}
