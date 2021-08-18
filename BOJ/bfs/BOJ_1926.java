package bfs;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_1926 {
	
	final static int MAX = 501;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = { 0, -1, 0, 1 };// 오른쪽 위쪽 왼쪽 아래쪽 확인을 위한 배열
	static int[] dy = { 1, 0, -1, 0 };
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		map = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
				visited[i][j] = false;
			}
		}
		BFS(n, m);
		sc.close();
	}
	
	public static void BFS(int n, int m) {
		Queue<Integer> queue = new LinkedList<Integer>();
		int cnt = 0, width = 0, max = -10;
		
		for(int i = 0 ; i < n; i++) {
			for(int j = 0; j < m; j++) {
				width = 0;
				if(map[i][j] == 1 && !visited[i][j]) {
					visited[i][j] = true;
					queue.add(i);
					queue.add(j);
					cnt++;
					width++;
					
					while(!queue.isEmpty()) {
						int qx = queue.poll();
						int qy = queue.poll();
						
						for(int k = 0; k < 4; k++) {
							int nx = qx + dx[k];
							int ny = qy + dy[k];
							
							if(nx < n && nx >= 0 && ny < m && ny >= 0) {
								if(!visited[nx][ny] && map[nx][ny] == 1) {
									visited[nx][ny] = true;
									queue.add(nx);
									queue.add(ny);
									width++;
								}
							}
						}		
					}
				}
				if(max < width)
					max = width;
			}
		}
		if(cnt == 0)
			System.out.println("0\n0\n");
		else 
			System.out.println(cnt + "\n" + max);
	}
}