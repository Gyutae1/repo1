package sec01.exam01;

public class 연산자Exam {

	public static void main(String[] args) {
		
		int a = 10;
//		a = 11;
//		a = 10 + 1;
		int b = a + 1;
		a = a + 1; // a = 10 + 1
		a += 1;    // a = a + 1 과 같다
		a++;	   // a += 1 과 같다	
		++a;
		
		a = 10;
		a++;
		System.out.println("a : "+ a);
		
		a = a - 2;
		a -= 2;
		a -= 1;
		a--;	// a -= 1 과 같다
		--a;
		
		a = 10;
		a--;
		System.out.println("a : "+ a);
		//현재 a가 9
		
		System.out.println("++a : "+ ++a);
		//현재 a가 10
		
		System.out.println("a++ : "+ a++); // a항을 쓰고 1을 더해준다
		
		System.out.println("a : "+ a); //출력 11
		//현재 a가 11
		
		System.out.println(a++ + ++a);
		// 11 + (a가 12가 된 상태)에다가 1더하기 해서 예측 : 11 + 13
		
		a = 11;
		int result = a; // a
		a = a + 1;		// a다음에 오는 ++
		a = a + 1;		// 두번째 a 앞에 오는 ++
		result = result + a;
		System.out.println(result);
		
		boolean c = true;
		System.out.println("c : "+ c);
		c = !c;
		System.out.println("!c : "+ c);
		
		double d = 7;
		System.out.println(d / 3);
//		System.out.println(3 / 0); //double 일때는 Infinity, int 일때는 / by zero 에러
		
		int f = 19321498;
		int p = 3;
		System.out.println("몫 : "+ (f / p));
		System.out.println("나머지 : "+ (f % p));
		
		int m = 10000;
		int co = 4500;
		System.out.println(m / co);
		System.out.println(m % co);
		
		int tea = 5000;
		int rip = 10000;
		double dis = 0.15;
		System.out.println(tea - tea * dis);
		int t_r = tea + rip;
		System.out.println(t_r - t_r * dis);
		
		int m_m = 7234;
		int five_t = 5000;
		int one_t = 1000;
		int five_h = 500;
		int one_h =	100;
		int five_ten = 50;
		int ten = 10;
		int one = 1;
		System.out.println("오천원 : "+ m_m / five_t);
		System.out.println("천원 : "+ (m_m % five_t) / one_t);
		System.out.println("오백원 :"+ (m_m % one_t) / five_h);
		System.out.println("백원 :"+ (m_m % five_h) / one_h);
		System.out.println("오십원 :"+ (m_m % one_h) / five_t);
		System.out.println("십원 :"+ (m_m % five_ten) / ten);
		System.out.println("일원 :"+ (m_m % ten) / one);
		
		String left = "수박";
		String right = "멜론";
		// swap 문제
		String m_mm = left;
		left = right;
		right = m_mm;
		
		System.out.println(left); // 결과 : 멜론
		System.out.println(right);	// 결과 : 수박
		 
	}

}
