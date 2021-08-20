package bfs;
import java.io.*;
import java.util.*;

public class BOJ_4179 {
	static char[][] map;
	
	static int[] dx = { 0, -1, 0, 1 };// 오른쪽 위쪽 왼쪽 아래쪽 확인을 위한 배열
	static int[] dy = { 1, 0, -1, 0 };
	
	static int R, C;
	static int[][] fire;
	static int[][] jihun;
	
	static Queue<Integer> jq = new LinkedList<Integer>();
	static Queue<Integer> fq = new LinkedList<Integer>();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		map = new char[R][C];

		fire = new int[R][C];
		jihun = new int[R][C];

		char[] input = null;
		
		for(int i = 0; i < R; i++) {
			input = br.readLine().toCharArray();
			for(int j = 0; j < C; j++) {
				map[i][j] = input[j];
			
				jihun[i][j] = -1;
				fire[i][j] = -1;
				if(map[i][j] == 'J') {
					jq.add(i);
					jq.add(j);
					jihun[i][j] = 0;
				} 
				else if(map[i][j] == 'F') {
					fq.add(i);
					fq.add(j);
					fire[i][j] = 0;
				}
			}
		}
		bfs_F(fq);
		bfs_J(jq);
	}
	
	public static void bfs_F(Queue<Integer> q) {	
		while(!q.isEmpty()) {
			int x = q.poll();
			int y = q.poll();

			for(int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx >= 0 && nx < R && ny >= 0 && ny < C) {
					if(fire[nx][ny] == -1 && map[nx][ny] != '#') {
						q.add(nx);
						q.add(ny);
						fire[nx][ny] = fire[x][y] + 1;
					}
				}
			}
		}
	}
	public static void bfs_J(Queue<Integer> q) {	
		while(!q.isEmpty()) {
			int x = q.poll();
			int y = q.poll();

			for(int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(isEdge(nx, ny)) {
					System.out.println(jihun[x][y] + 1);
					return;
				}
				
				if(jihun[nx][ny] == -1 && map[nx][ny] != '#') {
					if(fire[nx][ny] == -1 || fire[nx][ny] > jihun[x][y] + 1) {
						q.add(nx);
						q.add(ny);
						jihun[nx][ny] = jihun[x][y] + 1;
					}
				}
			}
		}
		System.out.println("IMPOSSIBLE");
	}
	
	public static boolean isEdge(int r, int c) {
		if(r < 0 || r >= R || c < 0 || c >= C)
			return true;	
		return false;
	}
}
