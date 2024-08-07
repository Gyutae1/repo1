package sec01.exam01;

public class TryExam {

	public static void main(String[] args) {
		
		
		String s1 = null;
//		System.out.println(s1.length()); // NullPointerException
		System.out.println(s1);
		
		int[] a = new int[2];
//		a[100] = 3; // ArrayIndexOutOfBoundsException
		
//		String s2 = "20a";
		String s2 = "20";
		int age = 0;
		try {
			age = Integer.parseInt(s2); // NumberFormatException 스트링의 숫자를 인트값으로 바꿔주는 메소드
															// 단 스트링에 글씨가 들어간 경우 발생하는 에러
			System.out.println(age + 1);
			
			ThrowsTest tt = new ThrowsTest();
//			tt.throwException();
			
			tt.human(3);
		}catch (HumanException he) {
			String message = he.getMessage();
			if("EC05".equals(message)) {
				System.out.println("5 미만을 입력하셨군요, 확인해주세요");
			} else if ("EC10".equals(message)) {
				System.out.println("10 초과해서 입력하셨군요, 확인해주세요");
			}
			
		}catch (Exception e) {
			System.out.println("오류발생!");
			System.out.println(e);
			System.out.println("-------------------------");
			
			e.printStackTrace(); // 안쓸거여도 이놈은 꼭 써라~
			
			System.out.println("---------------------------");
			System.out.println(e.getMessage());
		}
		
		System.out.println("완료");
		
		
		
	}

}
