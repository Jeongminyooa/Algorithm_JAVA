package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_2178 {

	static int[][] map;
	static boolean[][] visited;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			String str = st.nextToken();
			String[] strArray = str.split("");
			
			for(int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(strArray[j]);
				visited[i][j] = false;
			}
		}
		
		bfs(n, m);
		System.out.println(map[n-1][m-1]);
	}
	
	public static void bfs(int n, int m) {
		// 2차원 배열에서 상하좌우 원소 확인
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		visited[0][0] = true;
		queue.add(0);
		queue.add(0);
		
		while(!queue.isEmpty()) {
			// 큐에 좌표값을 빼줌
			int qx = queue.poll();
			int qy = queue.poll();
			
			// 좌표값 기준 상하좌우를 확인 (너비 우선)
			for(int k = 0; k < 4; k++) {
				int nx = qx + dx[k];
				int ny = qy + dy[k];
				
				if(nx < n && nx >= 0 && ny < m && ny >= 0) {
					if(map[nx][ny] == 1 && !visited[nx][ny]) {
						visited[nx][ny] = true;
						queue.add(nx);
						queue.add(ny);
						map[nx][ny] = map[qx][qy] + 1;
					}
				}
			}
		}
		
	}

}
