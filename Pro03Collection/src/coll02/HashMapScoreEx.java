// 해시맵을 이용하여 학생의 이름과 자바 점수를 기록하는 프로그램을 작성하라
package coll02;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {
	public static void main(String args[]) {
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();

		// 5개의 점수를 저장
		javaScore.put("강지윤", 97);
		javaScore.put("강효림", 88);
		javaScore.put("김소희", 98);
		javaScore.put("김예은", 100);
		javaScore.put("김지우", 99);
		
		System.out.println("HashMap의 요소의 갯수는 : " + javaScore.size());
		
		// 모든 사람의 점수를 출력
		// javaScore에 저장되어 있는 (key, value)를 출력하는데
		// keySet()는 key의 집합이고 문자열을 가진 집합 Set콜렉션에 반환
		Set<String> keys = javaScore.keySet();
		
		// key값들을 순차적으로 접근할수 있는 iterator객체변수를 생성
		Iterator<String> it = keys.iterator();
		// it는 "강지윤","강효림","기
		while(it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name + " : " + score);
		}
	}

}
