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

		
		// +, -������ ä���� ư ��� 
		// ���� ä���� 100
		int min = Math.abs(channal - 100);
		
		// �������� 999999���� ���� �� ���� (9�� �����ϰ� ��� ���峭 ���)
		for(int i = 0; i <= 999999; i++) {
			  String str = String.valueOf(i);
	          int len = str.length();
	          
	          boolean isPossible = true;
	          for(int j = 0; j < len; j++) {
	        	  // ���峭 ��ư�� �ִ��� Ȯ��
	        	  if(broken[str.charAt(j) - '0']) {
	        		  isPossible = false; 
	        		  break;
	        	  }
	          }
	          
	          if(isPossible) {
	        	  // ���峭 ��ư�� ���ٸ� +,- Ƚ���� ���̸� ��
	        	  int rlt = Math.abs(channal - i) + len;
	        	  if(min > rlt) 
	        		  min = rlt;
	          }
		}
		System.out.println(min);
		
	}

}
