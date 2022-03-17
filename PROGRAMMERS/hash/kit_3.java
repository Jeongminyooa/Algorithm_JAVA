package hash;
import java.util.HashMap;
import java.util.Set;

public class kit_3 {
	// 위장
	public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        // 타입의 개수 넣어두기
        for(String[] type : clothes) {
            map.put(type[1], map.getOrDefault(type[1], 0) + 1);
        }
        
        Set<String> typeKey = map.keySet();
        
        // 종류마다 안 입을 수도 있다.
        for(String type : typeKey) {
            answer *= map.get(type) + 1;
        }
        // 아무것도 안 입는 선택지는 없다.
        return answer - 1;
    }
}
