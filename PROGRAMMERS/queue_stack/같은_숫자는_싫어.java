package queue_stack;

import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class 같은_숫자는_싫어 {
	
	public static void main(String[] argv) {
        int[] input = {1,2,3,4};

        int[] result = solution(input);
        for(int i : result) {
        	System.out.print(i + " ");
        }
	}
	
	public static int[] solution(int []arr) {
        List<Integer> temp = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < arr.length; i++) {
       
        	if(queue.size() == 0) {
        		queue.offer(arr[i]);
        	}
        	if(queue.peek() != arr[i]) {
        		queue.offer(arr[i]);
        		temp.add(queue.poll());
        	}
        }
        
        temp.add(queue.poll());
        
        int[] answer = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++) {
        	answer[i] = temp.get(i);
        }
       
        return answer;
    }
}
