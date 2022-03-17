package queue_stack;
import java.util.Stack;

public class kit_4 {
	// 주식가격 
	 public int[] solution(int[] prices) {
	        int len = prices.length;
	        int[] answer = new int[len];
	        Stack<Integer> stack = new Stack<>();
	        
	       for(int i = 0; i < len; i++) {
	           while(!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
	                int pop = stack.pop();
	                answer[pop] = i - pop;
	           }
	           stack.push(i);
	       }
	        
	        while(!stack.isEmpty()) {
	            int top = stack.pop();
	            answer[top] = len -1 - top;
	        }
	        return answer;
	    }
}
