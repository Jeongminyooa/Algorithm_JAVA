package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2445 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n * 2; j++) {
				if(j > i && j < n * 2 - (i + 1)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}			
			System.out.println();
		}
		
		for(int i = n; i > 0; i--) {
			for(int j = 0; j < n * 2; j++) {
				if(j < i - 1 || j > n * 2 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
