package brute_force;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1476 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int cnt_E = 1;
		int cnt_S = 1;
		int cnt_M = 1;
		
		int year = 1;
		
		while(!(E == cnt_E && S == cnt_S && M == cnt_M)) {
			cnt_E++;
			if(cnt_E > 15)
				cnt_E = 1;
			
			cnt_S++;
			if(cnt_S > 28)
				cnt_S = 1;
			
			cnt_M++;
			if(cnt_M > 19)
				cnt_M = 1;
			
			year++;
		}
		
		System.out.println(year);
	}

}
