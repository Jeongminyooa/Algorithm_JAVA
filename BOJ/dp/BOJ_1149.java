package dp;
import java.io.*;
import java.util.*;

public class BOJ_1149 {

	static final int SIZE = 1001;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] dp = new int[SIZE][3];
		int[] R = new int[SIZE];
		int[] G = new int[SIZE];
		int[] B = new int[SIZE];
		
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			R[i] = Integer.parseInt(st.nextToken());
			G[i] = Integer.parseInt(st.nextToken());
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		//�ʱⰪ
		dp[0][0] = R[0];
		dp[0][1] = G[0];
		dp[0][2] = B[0];
		
		for(int i = 1; i < n; i++) {
			dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + R[i];
			dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + G[i];
			dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + B[i];
		}
		
		int rlt = Math.min(dp[n-1][0], dp[n-1][1]);
		rlt = Math.min(rlt, dp[n-1][2]);
		
		System.out.println(rlt);
	}

}
