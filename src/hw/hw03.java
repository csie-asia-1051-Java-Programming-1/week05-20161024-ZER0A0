package hw;
/*
 * Topic: 設計一個程式，讓使用者輸入一個正整數n，判斷並輸出n的多少次方才會大於10000
 * Date: 2016/10/30
 * Author: 105021041 楊建宸
 */

import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("輸入正整數：");
		int n = scn.nextInt();
		int t = 1;
		int m = 1;
		
		for(int x = 1 ; t <= 10000 ; x++)
		{t = t * n ; m = x;}
		System.out.print(m);
		
		

	}

}
