package recursion;
import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1629 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A, B, C;
		
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		System.out.println(pow(A, B, C));
		
	}
	
	//base : 밑, exponent : 지수
	static long pow(long base, long exponent, long C) {
		
		if(exponent == 1) {
			return base % C;
		}
		
		long temp = pow(base, exponent/2, C);
		
		// 지수가 홀수라면 한번 더 밑을 곱해준다.
		if(exponent % 2 == 1) {
			return ((temp * temp % C) * base) % C;
		}
		
		return temp * temp % C;
	}

}
