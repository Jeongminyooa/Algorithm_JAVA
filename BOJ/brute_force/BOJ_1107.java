package brute_force;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1107 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int channal = Integer.parseInt(br.readLine());
		int brokenCnt = Integer.parseInt(br.readLine());
		
		boolean[] broken = new boolean[10];
		
		if(brokenCnt != 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < brokenCnt; i++) {
				int index = Integer.parseInt(st.nextToken());
				broken[index] = true;
 			}
		}

		
		// +, -만으로 채널을 튼 경우 
		// 시작 채널은 100
		int min = Math.abs(channal - 100);
		
		// 리모콘은 999999까지 누를 수 있음 (9를 제외하고 모두 고장난 경우)
		for(int i = 0; i <= 999999; i++) {
			  String str = String.valueOf(i);
	          int len = str.length();
	          
	          boolean isPossible = true;
	          for(int j = 0; j < len; j++) {
	        	  // 고장난 버튼이 있는지 확인
	        	  if(broken[str.charAt(j) - '0']) {
	        		  isPossible = false; 
	        		  break;
	        	  }
	          }
	          
	          if(isPossible) {
	        	  // 고장난 버튼이 없다면 +,- 횟수와 길이를 합
	        	  int rlt = Math.abs(channal - i) + len;
	        	  if(min > rlt) 
	        		  min = rlt;
	          }
		}
		System.out.println(min);
		
	}

}
