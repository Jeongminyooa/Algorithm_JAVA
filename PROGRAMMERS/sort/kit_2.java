package sort;

import java.util.Comparator;
import java.util.Arrays;

public class kit_2 {
	public String solution(int[] numbers) {
        String answer = "";
        String[] str_num = new String[numbers.length];
        
        // 문자열로 바꾸기
        for(int i = 0; i < numbers.length; i++) {
            str_num[i] = String.valueOf(numbers[i]);
        }
        
        // 합친 수가 더 크다면 앞으로 가도록 정렬
        Arrays.sort(str_num, new Comparator<String>(){
            public int compare(String o1, String o2){
                return (o2+o1).compareTo(o1+o2);
            }
        });
        
        if(str_num[0].equals("0")) {
            return "0";
        }
        for(String str : str_num) {
            answer += str;
        }
        return answer;
    }
}
