package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2446 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n * 2 - 1; j++) {
				if(j >= i && j < n * 2 - i - 1) {
					System.out.print("*");
				} else {
					if(j >= n * 2 - i - 1)
						break;// 백준 출력형식
					System.out.print(" ");
				}
			}			
			System.out.println();
		}
		
		for(int i = n - 1; i > 0; i--) {
			for(int j = 0; j < n * 2 - 1; j++) {
				if(j + 1 < i || j > n * 2 - i - 1) {
					if(j > n * 2 - i - 1) break; // 백준 출력형식
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
