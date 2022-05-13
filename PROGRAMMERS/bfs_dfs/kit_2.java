package bfs_dfs;

import java.util.*;

public class kit_2 {
	// level3 네트워크

	public int solution(int n, int[][] computers) {
		int answer = 0;

		Queue<int[]> queue = new LinkedList<int[]>();
		boolean[] visited = new boolean[n];
		for (int i = 0; i < computers.length; i++) {
			if (visited[i])
				continue;

			queue.offer(computers[i]);
			visited[i] = true;

			while (!queue.isEmpty()) {
				int[] computer = queue.poll();

				for (int j = 0; j < computer.length; j++) {
					if (!visited[j] && computer[j] == 1) {
						queue.offer(computers[j]);
						visited[j] = true;
					}
				}
			}
			answer++;
		}
		return answer;
	}

}
