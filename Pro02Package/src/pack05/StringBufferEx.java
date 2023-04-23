package pack05;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This ");
		
		sb.append("is pencil.");	// sb의 문자열 뒤에 붙이기
		System.out.println(sb);		// 

		sb.insert(7, " my");		// sb문자열의 인덱스 7번째(0부터 출발) 위치에 " my"삽입
		System.out.println(sb);		// sb = "This is my pencil"

		sb.replace(8, 10, "your");	// sb문자열의 8번째 부터 10-1번째 문자열을 "your"로 교체
		System.out.println(sb);		// This is your pencil

		sb.delete(8, 13);
		System.out.println(sb);

		sb.setLength(4);
		System.out.println(sb);

	}

}
