package hw;
/*
 * Topic: 讓使用者輸入一正整數n，
 * 計算1/(1*2)+1/(3*4)+1/(5*6)+…+1/[(2n-1)*(2n)]並輸出結果
 * Date: 2016/10/30
 * Author: 105021041 楊建宸
 */

import java.util.Scanner;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("輸入正整數：");
		int n = scn.nextInt();
		float t = 0;
		
		for(int m = 1 ; m <= n ; m ++)
		{t = t + (float)1 / ((2*m-1)*(2*m));}
		System.out.print(t);
		
	}

}
