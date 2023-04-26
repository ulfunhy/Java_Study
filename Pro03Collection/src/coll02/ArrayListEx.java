package coll02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		Arrray<String> a = new ArrayList<String>();
		// 문자열 데이터를 담는 ArrayList객체변수 a를 만들고, 생성자가
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하시오>>");
			String s = sc.next();	// 키보드로 문자열을 입력받음
			a.add(s);
		}
		
		for (int i = 0; i < 4; i++) {
			String name = a.get(i);	// 0부터 데이터 가져온후 name에 저장
			System.out.print(name + " ");
		}
		
		// 이름이 가장 긴 것을 출력
		// 입력된 데이터 Mike jane Ashely Helen
		int longestIndex = 0;
		for(int j = 1; i < a.size(); i++) {
			if(a.get(longestIndex).length())}
		}
	
	System.out.println("\n가장 긴 이름은 : " + a.get(longestindex));
}
