package dp;

import java.io.*;
public class BOJ_11727 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[1001];
		
		if(n == 1) {
			System.out.println(n);
			return;
		}
		dp[1] = 1;
		dp[2] = 3;
		
		for(int i = 3; i <= n; i++) {
			if(i % 2 == 0) {
				dp[i] = dp[i-1] + dp[i-2] + (i / 2);
			}
			else {
				dp[i] = dp[i-1] + dp[i-2] + (i / 2);
			}
		}
		
		System.out.println(dp[n]);
	}

}
