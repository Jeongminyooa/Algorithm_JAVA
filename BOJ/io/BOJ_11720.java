package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11720 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		int rlt = 0;
		st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		
		String[] tokens = str.split("");
		for(int i = 0; i < n; i++) {
			
			rlt += Integer.parseInt(tokens[i]);
		}
		
		System.out.println(rlt);
		
	}
}
