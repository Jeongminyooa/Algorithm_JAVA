package greedy;

public class 체육복 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = solution(3, new int[]{3}, new int[] {1});
		
		System.out.println(result);
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int[] arr = new int[n];
		
		for(int i : lost) {
			arr[i-1] -= 1;
		}
		for(int i : reserve) {
			arr[i-1] += 1;
		}
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == -1) {
				if((i-1) >= 0 && arr[i-1] >= 1) {
					arr[i-1] -= 1;
					arr[i] += 1;
				} else if((i+1) < n && arr[i+1] >= 1) {
					arr[i+1] -= 1;
					arr[i] += 1;
				}
			}
		}
		
		int count = 0;
		for(int i : arr) {
			if(i >= 0) {
				count++;
			}
		}
		return count;
	}
}
