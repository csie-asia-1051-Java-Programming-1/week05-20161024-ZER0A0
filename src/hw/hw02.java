package hw;
/*
 * Topic: 讓使用者輸入一正整數n，輸出1+2+3+…+m<=n的最大整數m=?
 * Date: 2016/10/30
 * Author: 105021041 楊建宸
 */

import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("輸入正整數：");
		int n = scn.nextInt();
		int m = 1;
		int t = 0;
		
		for(int x = 1; t <= n; x ++)
		{t = t + x; m = x;}
		m --;
		System.out.print(m);

	}

}
