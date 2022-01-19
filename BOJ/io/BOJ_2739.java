package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2739 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int mon = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());
		
		int[] dayOfMonth = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] dayOfWeek = new String[] {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		int sumOfDay = 0;
		for(int i = 0; i < mon - 1; i++) {
			sumOfDay += dayOfMonth[i];
		}
		sumOfDay += day;
		
		System.out.println(dayOfWeek[sumOfDay % 7]);
	}
}
