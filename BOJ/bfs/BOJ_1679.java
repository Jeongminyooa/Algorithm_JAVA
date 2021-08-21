package bfs;
import java.io.*;
import java.util.*;

public class BOJ_1679 {

	static int SUBIN;
	static int SISTER;
	static int[] list;
	static final int SIZE = 100001;
	
	static Queue<Integer> q = new LinkedList<Integer>();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		
		SUBIN = Integer.parseInt(st.nextToken());
		SISTER = Integer.parseInt(st.nextToken());
		
		list = new int[SIZE];
		
		for(int i = 0; i < SIZE; i++) {
			list[i] = -1;
			
			if(i == SUBIN) {
				list[SUBIN] = 0;
				q.add(SUBIN);
			}
		}
		
		bfs();
	}
	
	public static void bfs() {
		while(list[SISTER] == -1) {
			int cur = q.poll();
			
			// 조건문 순서 유의! 범위 확인 후 배열 확인 해야 범위 에러가 나지 않음.
			if((cur + 1) < SIZE && (cur + 1) >= 0 && list[cur + 1] == -1) {
				list[cur + 1] = list[cur] + 1;
				q.add(cur + 1);
			}
			
			if((cur - 1) < SIZE && (cur - 1) >= 0 && list[cur - 1] == -1) {
				list[cur - 1] = list[cur] + 1;
				q.add(cur - 1);
			}
			
			if((cur * 2) < SIZE && (cur * 2) >= 0 && list[cur * 2] == -1) {
				list[cur * 2] = list[cur] + 1;
				q.add(cur * 2);
			}
		}
		System.out.println(list[SISTER]);
	}
}
