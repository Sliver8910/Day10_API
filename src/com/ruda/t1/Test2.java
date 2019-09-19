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
		jumin = jumin.replace("-", "");
		String num1 = jumin.substring(0, 8);
		String[] nums1=num1.split("");
		int sum =0;
		for(int i=0;i<num1.length();i++) {
			int sum2 = Integer.parseInt(nums1[i]);
			//Integer integer = new Integer(nums1[i]);
			sum = (sum2)*(i+2)+sum;
		}
		System.out.println(sum);
	}


}
