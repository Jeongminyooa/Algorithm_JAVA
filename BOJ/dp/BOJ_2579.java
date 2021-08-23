package dp;
import java.io.*;

public class BOJ_2579 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] dp = new int[301][2];
		int[] s = new int[301];
		
		for(int i = 0; i < n; i++) {
			int input = Integer.parseInt(br.readLine());
			s[i] = input;
		}
		
		if(n == 1) { 
			System.out.println(s[0]);
			return;
			}
		
		dp[0][0] = s[0];
		dp[0][1] = 0;
		dp[1][0] = s[1];
		dp[1][1] = s[0] + s[1];
		
		for(int i = 2; i < n; i++) {
			dp[i][0] = Math.max(dp[i-2][0], dp[i-2][1]) + s[i];
			dp[i][1] = dp[i-1][0] + s[i];
		}
		
		System.out.println(Math.max(dp[n-1][0], dp[n-1][1]));
	}

}
