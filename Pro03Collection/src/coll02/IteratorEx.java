package coll02;

import java.util.Vector;

public class IteratorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		int sum = 0;
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		Iterator<Integer> ir = v.iterator();	// v벡터에 5 4 100 -1가 저장
		// it객체변수는 v객체의 데이터를 순차적으로 접근할 수 있다.
		while(it.hasNext()) {	// it.hasNext()는 5를 가리키기 때문에 true값을 리턴
			int n = it.next();	// 5를 n에게 넘겨주고 난 후에 it는 그 다음 데이터를 가리키게 된다.
			sum += n;
			System.out.println(n + " ");
		}
		System.out.println("\n벡터 데이터 합 : " + sum);

	}

}
