package com.ruda.t1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//스캐너를 사용
		//주민등록번호 입력
		//나이
		//계절 봄 345 여름 678 가을 9,10,11,겨울 12,1,2
		//성별
		//9999991111111

		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호 입력");
		String num = sc.next();
		num = num.replace("-", "");
		String age= (String) num.subSequence(0, 2);
		Integer integer = new Integer(age);
		//int year = Integer.parseInt(age);  이렇게도 작성가능
		System.out.println("나이 : "+(120-integer)+"세");

		String season = num.substring(2, 4);
		Integer season2 = new Integer(season);
		if(season2>2 && season2<6) {
			System.out.println("태어난 계절 : 봄");
		}else if(season2>5 && season2<9) {
			System.out.println("태어난 계절 : 여름");
		}else if(season2>8 && season2<12) {
			System.out.println("태어난 계절 : 가을");
		}else if(season2<3||season2==12) {
			System.out.println("태어난 계절 : 겨울");
		}else {System.out.println("주민번호 입력 에러");}
		String sex = num.substring(6,7);
		//char ch = jumin.charAt(6);
		Integer sex1 = new Integer(sex);
		if(sex1==1 || sex1==3 || sex1==5) {
			System.out.println("성별 : 남자");
		}else if(sex1==2 || sex1==4 ||sex1==6) {
			System.out.println("성별 : 여자");
		}else {System.out.println("주민번호 입력 에러");}
	}
}
