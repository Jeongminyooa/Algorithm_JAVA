package dp;

import java.util.*;

class kit_1 {
    // 연산 횟수만큼 사용되는 값들이 저장
    // 곱셈과 덧셈의 경우, 중복된 값이 나오기때문에 Set 컨테이너 사용
    Set<Integer>[] set = new HashSet[9];
    
    public int solution(int N, int number) {
        int answer = 0;
        
        int n = 0;
        // 초기화
        for(int i=1; i<9; i++) {
            n = (n * 10) + N;
            set[i] = new HashSet();
            set[i].add(n);
        }
        
        for(int i = 1; i <= 8; i++) {
            // 1번 사용은 N 하나밖에 없으니 이미 초기화로 값이 완성됨.
            for(int j = 1; j < i; j++) {
                // 1번 사용한 값부터 i개까지 조합을 add
                for(Integer unionA : set[j]) {
                    for(Integer unionB : set[i-j]) {
                        // j번째와 i-j번째의 사칙연산 조합
                        set[i].add(unionA + unionB);
                        set[i].add(unionA - unionB);
                        set[i].add(unionA * unionB);
                        if(unionB != 0) {
                            set[i].add(unionA / unionB);
                        }
                        if (unionA != 0) {
                            set[i].add(unionB / unionA);
                        }
                    }
                }
            }
            // 계산된 set에 target이 있다면 결과 리턴
              if (set[i].contains(number)) {
                answer = i;
                return answer;
            }
        }
        // 없다면 -1 리턴
        return -1;
    }
}