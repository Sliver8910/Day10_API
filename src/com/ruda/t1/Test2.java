package com.ruda.t1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//주민등록 번호입력 991222-1234567
		//주민번호가 유효한 코드인지 아닌지를 판별하는 코드 만들기
		//  9	 7	1	2	2	2	1	2	3	4	5	6	7(검증용번호)
		//1.*2    3	4	5	6	7	8	9	2	3	4	5	
		//2.18+  21+4+	10+	12+	14+	8+	18+	6+	12+	20+	30 = 173
		//179 /11 -- 몫 15 나머지 

		//4. 11-8(나머지) --3(결과값)
		//4-1. 결과값이 두자리라면 
		//		결과값/10 ---나머지 를 결과값으로 대입해서 검증용번호와 비교
		//5. 결과값 == 검증용번호 (틀리면 잘못된 번호, 같으면 맞는 번호)
		Scanner sc = new Scanner(System.in);
		//System.out.println("주민번호 입력");
		//String jumin = sc.next();
		String jumin = "991222-1234567";

		//1. splite
		//String [] jumins = jumin.split("");
		//2 subString
		jumin = jumin.replace("-", "");
		String num1 = jumin.substring(0, 8);
		String[] nums1=num1.split("");
		int sum =0;
		for(int i=0;i<num1.length();i++) {
			int sum2 = Integer.parseInt(nums1[i]);
			//Integer integer = new Integer(nums1[i]);
			sum = (sum2)*(i+2)+sum;
		}
		String num2 = jumin.substring(8, 12);
		String[] nums2=num2.split("");
		int sum4 = 0;
		for(int i=0;i<num2.length();i++) {
			int sum3 = Integer.parseInt(nums2[i]);
			//Integer integer = new Integer(nums1[i]);
			sum4 = (sum3)*(i+2)+sum4;	
		}
		String num3 = jumin.substring(12, 13);
		int num4 = Integer.parseInt(num3);
		sum = sum+sum4; 
		int sumb = sum%11;
		sumb = 11-sumb;
		if(sumb<10 && sumb==num4) {System.out.println("주민등록번호 유효");
		}else if (sumb>9&&(sumb%10)==num4) {
			System.out.println("주민등록번호 유효");
		}else {
			System.out.println("유효하지 않은 주민등록번호");
		}
		/***********************************************
		//3. char at
		int sum7=0;
		int idx=2;
		for(int i =0; i<jumin.length()-1;i++) {
			if(i==6) {
				continue;
				}
			char ch = jumin.charAt(i);
			String n1 = String.valueOf(ch);

			int n = Integer.parseInt(n1);
			sum7 = sum7+n*idx;
			idx++;
			if(idx==1) {
				idx=2;
			}

		}
		sum7 =sum7%11;
		sum7=11-sum7;
		if(sum7>9) {
			sum7 = sum7%10;
		}
		int result = Integer.parseInt(String.valueOf(jumin.charAt(jumin.length()-1)));

		if(sum7==result) {System.out.println("맞는 번호");

		}else {
			System.out.println("틀린 번호");
		}
		 **********************************/
	}


}
