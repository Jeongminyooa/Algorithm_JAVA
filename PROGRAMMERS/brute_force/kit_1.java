package brute_force;

import java.util.ArrayList;

public class kit_1 {
	public int[] solution(int[] answers) {
	       
        int[] st1 = {1, 2, 3, 4, 5};
        int[] st2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] st3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int cnt1 = 0, cnt2 = 0, cnt3 = 0;
        for(int i = 0; i < answers.length; i++) {
            // 1번 수포자
           if(answers[i] == st1[i % 5])
               cnt1++;
            
            // 2번 수포자
          if(answers[i] == st2[i % 8])
              cnt2++;
            
            //3번 수포자
           if(answers[i] == st3[i % 10])
               cnt3++;
        }
        
        int max = Math.max(Math.max(cnt1, cnt2), cnt3);
        
        ArrayList<Integer> rlt = new ArrayList<Integer>();
        if(max == cnt1) rlt.add(1);
        if(max == cnt2) rlt.add(2);
        if(max == cnt3) rlt.add(3);
        
         int[] answer = new int[rlt.size()];
        for(int i = 0; i < rlt.size(); i++) {
            answer[i] = rlt.get(i);
        }
            return answer;
    }
}
