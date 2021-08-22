package dp;
import java.io.*;
import java.util.*;

public class BOJ_1463 {
	static final int SIZE = 1000001;
	static int[] DP = new int[SIZE];
	static int X;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		X = Integer.parseInt(br.readLine());
		DP[1] = 0;
		
		for(int i = 2; i <= X; i++) {
			DP[i] = DP[i - 1] + 1;
			if(i%2 == 0) DP[i] = Math.min(DP[i], DP[i/2] + 1);
			if(i%3 == 0) DP[i] = Math.min(DP[i], DP[i/3] + 1);
		}
		
		System.out.println(DP[X]);
	}

}
