package dp;
import java.io.*;

public class BOJ_9095 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] dp = new int[11];
		
		int T = Integer.parseInt(br.readLine());

		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for(int i = 4; i < 11; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		
		for(int i = 0; i < T; i++) {
			int input = Integer.parseInt(br.readLine());
			System.out.println(dp[input]);
		}
	}
	
}