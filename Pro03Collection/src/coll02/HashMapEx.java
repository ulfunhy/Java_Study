package coll02;

//(영어, 
import java.util.HashMap;
import java.util.Scanner;
public class HashMapEx {
	public static void main(String args[]) {
		// dic객체변수는 HashMap타입이고 key값은 String, value값도 String
		HashMap<String, String> dic = new HashMap<String, String>();
		
		// HashMap객체인 dic에 3개의 (key, value)값을 저장
		dic.put("baby", "아기");	// key는 "baby", value는 "아기"
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		Scanner sc = new Scanner(System.in);	// 키보드로 부터 입력받기 위한 객체 생성
		while(true) {	// 무한 반복
			System.out.println("찾고 싶은 단어는?");
			String eng = sc.next();		// 키보드로 부터 키값 문자열 입력 받음
			if(eng.equals("exit")) {	// 입력받은 문자열이 "exit"이면 true반환
				System.out.println("종료됩니다.");
				break;	// while반복문을 빠져나간다.
			}
			
			String kor = dic.get(eng);	// eng는 키값에 해당하는 value를 kor에 저장
			// 만약에 입력한 값이 dic객체에 없는 키 값이면 null을 반환
			if(kor == null)
				System.out.println(eng + "는 없는 단어입니다.");
			else
				System.out.println(kor);
		}
	}
}
