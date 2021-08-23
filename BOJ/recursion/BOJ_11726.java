package recursion;
import java.io.*;

public class BOJ_11726 {

	static int[] memo;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		memo = new int[n+1];
		
		System.out.println(tiling(n));
	}
	
	public static int tiling(int n) {
		if(n == 1 || n == 2) {
			if(memo[n] == 0)
				memo[n] = n;
			return memo[n];
		}
		else {
			if(memo[n] == 0)
				memo[n] = tiling(n-1) + tiling(n-2);
			return memo[n] % 10007;
		}
	}

}
