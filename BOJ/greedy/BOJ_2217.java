package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class BOJ_2217 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int[] rope = new int[N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			rope[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(rope);
		
		int max_w = 0;
		for(int i = 0; i < N; i++) {
			int w = rope[i] * (N - i);
			if(max_w < w) {
				max_w = w;
			}
		}

		System.out.println(max_w);
	}

}
