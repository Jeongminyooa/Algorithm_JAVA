package greedy;
import java.io.*;
import java.util.*;

public class BOJ_11047 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] A = new int[N];
		
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = N - 1; i >= 0; i--) {
			cnt += K / A[i];
			K %= A[i];
		}
		System.out.println(cnt);
	}

}
