﻿package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 105021041 楊建宸
 */

import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("輸入正整數：");
		int n = scn.nextInt();
		int m = 1;
		int a = 1;
		int t = 0;
		
		while(m <= n)
		{a = 2 * a ; m = m + 1 ; t = t + a;}
		System.out.print(t);

	}

}
