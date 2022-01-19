package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10992 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n - 1; j++) {
					System.out.print(" ");
				}
			
			if(i == n - 1) {
				for(int j = 0; j < 2 * i + 1; j++) {
					System.out.print("*");
				}
			}
			else {
				for(int j = 0; j < 2 * i + 1; j++) {
					if(j == 0 || j == 2 * i) 
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
