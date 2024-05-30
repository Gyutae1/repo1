package chap05;

public class RefExam {

	public static void main(String[] args) {

		int a;
//		System.out.println(a); 
//		int b = a;
		
		String c = "박규태";// =을 기준으로 오른쪽 먼저 실행됨
							// "박규태"가 힙heap 영역에 비어있는 번지에 들어간다
							// 스택stack 영역의 c에 그 번지가 기록된다
		System.out.println("c == null ="+ (c == null) );
		System.out.println("c != null ="+ (c != null) );
		System.out.println("c = "+ c);
		
//		c = null;	// 주소값을 비워서 연결 끊기
		
		System.out.println("c == null : "+ (c == null) );
		System.out.println("c != null : "+ (c != null) );
		System.out.println("c = "+ c);
		 
		String d;
		// 기본타입과 마찬가지로
		// 값을 할당하지 않으면 사용할 수 없다
//		System.out.println(d);
		
		d = "박규태";
		c = "박규태"; // == 결과값 true , 이건 String만 특별대우
		System.out.println(c == d);
		
		c = new String("박규태"); // 새로운 주소에 할당
		System.out.println(c == d); // 결과값 false
		System.out.println( c.equals(d) );
		
		c = null;
//		System.out.println( c.equals(d) );
		String e = c + "abc";
		System.out.println(e);

	}

}
