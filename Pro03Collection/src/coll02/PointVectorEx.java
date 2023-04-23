package coll02;

import java.util.Vector;

public class PointVectorEx {
	public static void main(String[] args) {
		// v객체변수는 Point 타입의 데이터를 저장
		Vector<Point> v = new Vector<Point>();
		
		v.add(new Point(2,3));		// 0번째 데이터 삽입
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
//		v.add(100, 200);---에러발생
		
		v.remove(1); 	// 인덱스 1번째 데이터를 삭제한다
		// 데이터는 뒤로 한칸씩 이동한다.
		for(int i = 0; i < v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);	// p.toString
		}
	}

}
