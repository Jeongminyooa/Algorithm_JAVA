package dp;

import java.io.*;

public class BOJ_12852 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[1000001];
		int[] lotation = new int[1000001];
		
		dp[1] = 0;
		lotation[1] = 0;
		for(int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + 1;
			lotation[i] = i - 1;
			
			if(i % 3 == 0) {
				if(dp[i] > dp[i/3] + 1) {
					dp[i] = dp[i/3] + 1;
					lotation[i] = i/3;
				}
			}
			if(i % 2 == 0) {
				if(dp[i] > dp[i/2] + 1) {
					dp[i] = dp[i/2] + 1;
					lotation[i] = i/2;
				}
			}
		}
		
		System.out.println(dp[n]);
		
		System.out.print(n + " ");
		for(int i = n; i > 1; i = lotation[i]) {
			System.out.print(lotation[i] + " ");
		}
	}

}
