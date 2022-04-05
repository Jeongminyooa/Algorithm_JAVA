package brute_force;

import java.util.*;

public class kit_2 {
	int answer = 0;
    public int solution(String numbers) {
        char[] numberStr = numbers.toCharArray();
        ArrayList<Integer> checkList = new ArrayList<Integer>();
        boolean[] visit = new boolean[numberStr.length];
        
        dfs(numberStr, 0, visit, checkList, 0);
        
        return answer;
    }
    
    //dfs를 이용해서 하나씩 확인해보기
    public void dfs(char[] numbers, int index, boolean[] visit, ArrayList<Integer> checkList, int makeNum) {
        // 모든 숫자 카드를 다 사용하면 중단
        if(index <= numbers.length) {
             for(int i = 0; i < numbers.length; i++) {
                 if(!visit[i]) {
                    int number = makeNum + (numbers[i] - '0'); //1
                    visit[i] = true; // 방문했다고 표시
                 
                    if(isPrime(number) && isCheck(number, checkList)) {
                        checkList.add(number);
                        answer++;
                    }
                    dfs(numbers, index + 1, visit, checkList, number * 10);
                    visit[i] = false;
                 } 
            }   
        }
       
    }
    
    // 소수 판별
    public boolean isPrime(int n) {
        if(n == 0 || n == 1) 
            return false;
        
	    for (int i = 2; i<=(int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
	    }
        
	    return true;
    }
    
    // 중복 판별
    public boolean isCheck(int n, ArrayList<Integer> checkList) {
        for(int checkNum : checkList) {
            if(n == checkNum)
                return false;
        }
        return true;
    }
}
