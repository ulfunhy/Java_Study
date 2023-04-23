// 주사위는 눈의 수(1~6)는 이것이다. 10번 던져서
// 1의 눈이 나오면 500원,
// 2의 눈이 나오면 1000원,
// 3의 눈이 나오면 1500원,
// 4의 눈이 나오면 2000원,
// 5의 눈이 나오면 2500원,
// 6의 눈이 나오면 3000원,
// 전체의 금액은 얼마인가?

package pack05;

public class RandomEx {

	public static void main(String[] args) {
		// 나
//		int num[] = new int[10]; 
//		int money = 0;
//		
//		for(int i = 0; i < 10; i++) {
//			num[i] = (int)(Math.random()*6+1);
//			switch(num[i]) {
//			case 1:
//				money += 500; break;
//			case 2:
//				money += 1000; break;
//			case 3:
//				money += 1500; break;
//			case 4:
//				money += 2000; break;
//			case 5:
//				money += 2500; break;
//			case 6:
//				money += 3000; break;
//			}
//			System.out.println(num[i]);
//		}
//		System.out.println("총 금액 : " + money);

		// 선생님
		int balance = 0;
		int rn;
		
		for(int i = 0; i < 10; i++) {
			rn = (int)(Math.random()*6+1);
			System.out.println(rn+" ");
			balance += rn * 500;
		}
		System.out.println();
		System.out.println("");
	}

}
