package hash;
import java.util.Map;
import java.util.HashMap;

public class kit_1 {

	// 완주하지 못한 선수
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String part : participant) {
            map.put(part, map.getOrDefault(part, 0) + 1);
        }
        for(String com : completion) {
            map.put(com, map.get(com) - 1);
        }
        
        for(String player : map.keySet()) {
            if(map.get(player) != 0) {
                answer = player;
            }
        }
        return answer;
    }

}
