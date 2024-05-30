package chap05;

import java.util.ArrayList;

public class ArrayExam {

	public static void main(String[] args) {
//		int a = null; 기본 타입에는 null을 넣을 수 없음
		
		// 배열
		// 한번에 여러 변수를 만드는 기술
		// 같은 타입만 선언할 수 있음
		// 생성된 여러 변수들은 index로 관리할 수 있다
		
		// 선언 방법
		// "int로 구성된 배열이다"
		int[] score;	// java 스타일
		int score2[]; // c 스타일
		
		score = null;
		
		int[] score3 = null;
		
		int score01 = 90;
		int score02 = 60;
		int score03 = 70;
		
		// 배열을 생성할때 크기를 줘야 합니다.
		// 첫번째 [] : int[]는 배열인데 int로 이루어진 배열이다
		// 두번째 new int[3] : 배열의 크기 - 한번에 만들 변수의 개수
							//연달아서 타입의 크기만큼 메모리 할당
							//첫번째 변수부터 index 0으로 시작
		// 세번째 intArray[0] : 만들어진 변수들 중 첫번째 변수를 뜻함
		
		int[] intArray = new int[3];
		intArray[0] = 90;
		intArray[1] = 60;
//		intArray[2]	= 70;
		
		System.out.println("intArray[1] = "+ intArray[1]);
		
		// 기본값은 0 또는 false 또는 null 로 초기화 된다
		System.out.println("intArray[2] = "+ intArray[2]);
//		System.out.println("intArray[3] = "+ intArray[3]);
		
		// 배열의 모든 값을 1로 바꾼다
//		intArray[0] = 1;
//		intArray[1] = 1;
//		intArray[2] = 1;
//		int a = 1;
//		a++;
//		intArray[a] = 1;
		
		for(int i = 0; i < 3 ; i++) {
			intArray[i] = 1;
		}
		
		for(int i=0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		
		System.out.println(intArray); // [I@59f95c5d
		System.out.println(intArray.length);
		// 한번 선언된 배열의 크기는 바꿀 수 없다
//		intArray.length =4;
		
		// 배열을 선언하는 두번째 방법
		// 값을 미리 알고 있을때
		// 크기는 알아서 계산된다
		int[] intArray2 = new int[] {10, 20, 30, 40};
		
		for (int u = 0; u < intArray2.length; u++) {
			System.out.println(intArray2[u]);
		}
		
		// 배열을 선언하는 세번째 방법
		// 선언과 동시에 초기화 할때만 가능
		int[] intArray3 = {100, 200, 300, 400};
		
		for (int u = 0; u < intArray3.length; u++) {
			System.out.println(intArray3[u]);
		}
		
		String[] StringArray = new String[5];
		for (int z = 0; z < StringArray.length; z++ ) {
			StringArray[z] = "박규태"+(z+1);
			System.out.println(StringArray[z]);
		}
		
		
		// 1~10까지 배열에 넣고 
		// 배열의 총 합
		// 배열의 평균값 출력
		
		int[] score5 = new int[10];
		for (int i = 0; i < score5.length; i++) {
			score5[i] = i+1;
		}
		
		int sum = 0;
		for (int i = 0; i < score5.length; i++) {
			sum += score5[i];
		}
		System.out.println("총합 : "+ sum);
		
		double avg = (double)sum / score5.length;
		System.out.println("평균 : "+ avg);
		
		int[] class1 = new int[22];
		int[] class2 = new int[22];
		int[] class3 = new int[22];
		int[] class4 = new int[22];
		
		// 맨뒤에 []는 배열을 뜻하고 그 앞에 있는 모든건 배열의 내용물
		// int[]을 변수들로 관리하는 배열이 된다는 뜻
		// [4] 는 "천안"의 크기 즉 "천안"으로 관리되는 변수의 개수  
		int[][] 천안 = new int[4][22];
		
		System.out.println(천안); // [[I@9e89d68
		System.out.println(천안[0]); // [I@3b192d32
		System.out.println(천안[0][0]); // int 기본값 0출력
		
		int[] 클래스1 = 천안[0];
//		int 학생1 = 클래스1[0];
		int 학생1 = 천안[0][0];
		
		int[][] 수원 = new int[4][22];
		int[][] 서울 = new int[4][22];
		
		int[][][] 휴먼 = new int[3][4][22];
		System.out.println(22 * 4 * 3);
		System.out.println(휴먼); //[[[I@16f65612
		
		System.out.println("휴먼.length : "+ 휴먼.length);
		System.out.println("휴먼[0].length : "+ 휴먼[0].length);
		System.out.println("휴먼[0][0].length : "+ 휴먼[0][0].length);
		
		
		for(int a = 0; a < 휴먼[0][0].length; a++) {
			System.out.println(휴먼[0][0][a]);
		}
		
		int[][] 달력 = new int[12][31];
		for(int i = 0; i<달력.length; i++) {
			
			for(int j = 0; j<달력[i].length; j++) {
				
				System.out.println("i : "+ (i+1) +" j : "+ (j+1) + " 달력[i][j] :"+ 달력[i][j]);
			}
		}
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("문자");
		list.add(true);
		

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// 배열의 length
		System.out.println(list.size());
		
		System.out.println(list);
		
		
		
		
		
		
		
		
		
	}

}
