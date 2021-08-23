package dp;
import java.io.*;
import java.util.*;

public class BOJ_11659 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] list = new int[N + 1];
		int[] dp = new int[N + 1];
		dp[0] = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
			
			dp[i] = dp[i - 1] + list[i];
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			System.out.println(dp[end] - dp[start-1]);
		}
	}

}
