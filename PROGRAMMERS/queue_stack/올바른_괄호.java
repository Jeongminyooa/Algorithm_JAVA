package queue_stack;

import java.util.Stack;

public class 올바른_괄호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(")()("));
	}

	static boolean solution(String s) {
		Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == '(') {
        		stack.push(s.charAt(i));
        	} else {
        		if(stack.size() == 0) {
        			return false;
        		} else if(stack.peek() == '(') {
            		stack.pop();
            	}
        	}
        }

        if(stack.size() == 0) {
        	return true;
		} else {
			 return false;
    	}
    }
}
