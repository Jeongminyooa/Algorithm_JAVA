package bfs_dfs;

public class kit_1 {
	//level2. 타겟 넘버
	int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, 0, target);
        
        return answer;
    }
    
    public void dfs(int[] numbers, int sum, int depth,int target) {
        if(depth == numbers.length) {
            if(sum == target) answer++;
        } else {
            dfs(numbers, sum + numbers[depth], depth+1, target);
            dfs(numbers, sum - numbers[depth], depth+1, target);   
        }
    }
}
