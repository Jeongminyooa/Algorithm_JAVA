package hash;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class kit_4 {
	//베스트 앨범 
	public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        // 장르에 재생 횟수를 넣어줌.
        for(int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        // 내림차순 정렬된 keySetList
        List<String> keySetList = new ArrayList<>(map.keySet());
        Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
        
        
        //장르별 베스트 곡을 임시로 넣을 리스트
        List<Integer> temp = new ArrayList<>();
		for(String key : keySetList) {
            int max = 0;
            int fir_idx = -1;
            int sec_idx = -1;
            
            // 첫 번째 베스트 곡 찾기.
            for(int i = 0; i < genres.length; i++) {
                if(key.equals(genres[i])) {
                    if(max < plays[i]) {
                        max = plays[i];
                        fir_idx = i;
                    }
                }
            }
            
            // 두 번째 베스트 곡 찾기
            max = 0;
            for(int i = 0; i < genres.length; i++) {
                if(key.equals(genres[i])) {
                    if(max < plays[i] && i != fir_idx) {
                        max = plays[i];
                        sec_idx = i;
                    }
                }
            }
            
            temp.add(fir_idx);
            if(sec_idx != -1) {
                temp.add(sec_idx);
            }
		}
        int[] answer = new int[temp.size()];
        for(int i = 0; i< temp.size();i++){
            answer[i] = temp.get(i);
        }

        return answer;
    }
}
