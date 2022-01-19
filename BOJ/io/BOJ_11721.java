package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11721 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		
		String[] tokens = str.split("");
		for(int i = 0; i < tokens.length; i++) {
			if(i != 0 && i % 10 == 0) {
				System.out.println();
			}
			System.out.print(tokens[i]);
		}
	}
}
