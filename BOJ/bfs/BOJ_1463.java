package bfs;
import java.io.*;
import java.util.*;

public class BOJ_1463 {
	static Queue<Integer> q = new LinkedList<Integer>();
	static final int SIZE = 1000001;
	static int[] list = new int[SIZE];
	static int X;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		X = Integer.parseInt(br.readLine());
		
		makeOne();
	}
	
	public static void makeOne() {
		list[X] = 1; // input이 1일 때를 고려하여 
		q.add(X);
		
		while(list[1] == 0) {
			int cur = q.poll();
		
			for(int i = 0; i < 3; i++) {
				int nxt;
				int rest = 0;
				
				if(i == 0) {
					nxt = cur / 3;
					rest = cur % 3;
				} 
				else if(i == 1) {
					nxt = cur / 2;
					rest = cur % 2;
				} 
				else {
					nxt = cur - 1;
				}
				
				if(nxt > 0 && nxt < SIZE && list[nxt] == 0 && rest == 0) {
					list[nxt] = list[cur] + 1;
					q.add(nxt);
				}
			}
		}
		System.out.println(list[1] - 1);
	}

}
