package queue_stack;

import java.util.Stack;

public class kit_3 {
	// 다리를 지나는 트럭 -미완성 
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int len = truck_weights.length;
        
        for(int i = 0; i < len; i++) {
            while(!stack.isEmpty()) {
                int w = truck_weights[stack.peek()];
                while(w + truck_weights[i] <= weight) {
                    stack.push(i);
                    w = w + truck_weights[i];
                }
                stack.pop();
            }
            stack.push(i);
            answer += bridge_length;
        }
        return answer;
    }
}
