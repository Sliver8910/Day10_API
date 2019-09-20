package com.ruda.t1;

public class Test3 {

	public static void main(String[] args) {
		double d=Math.ceil(6.72); //올림
		System.out.println(d);
		
		d = Math.floor(6.72); //내림
		System.out.println(d);
		d = 6.48;
		d = Math.round(d); //반올림
		System.out.println(d);
		d = Math.random(); //랜덤 0.0과 1.0 사이의 랜덤한 수를 리턴
		System.out.println(d);
		//숫자 0~9 사이의 숫자 랜덤
		System.out.println((int)(d*10));
		
	}

}
