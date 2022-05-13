package bfs_dfs;

public class kit_3 {
	// 단어 변환

	static int minCnt = 1000;

	public int solution(String begin, String target, String[] words) {
		int answer = 0;
		boolean[] visited = new boolean[words.length];

		dfs(begin, target, words, visited, 0);

		answer = minCnt;
		if (answer == 1000) {
			answer = 0;
		}
		return answer;
	}

	public void dfs(String begin, String target, String[] words, boolean[] visited, int cnt) {
		if (begin.equals(target)) {
			if (minCnt > cnt) {
				minCnt = cnt;
			}
			return;
		}
		for (int i = 0; i < words.length; i++) {
			if (!visited[i] && checkOneWord(begin, words[i])) {
				System.out.print(words[i] + "->");
				visited[i] = true;
				dfs(words[i], target, words, visited, cnt + 1);
				// 또 다른 경우를 위해
				visited[i] = false;
			}
		}
		return;
	}

	public boolean checkOneWord(String begin, String next) {
		String[] word1 = begin.split("");
		String[] word2 = next.split("");

		int changeCnt = 0;
		for (int i = 0; i < word1.length; i++) {
			if (!word1[i].equals(word2[i])) {
				changeCnt++;
			}
		}
		if (changeCnt == 1) {
			return true;
		}
		return false;
	}

}
