package chap05;

import java.nio.file.FileSystemAlreadyExistsException;

public class ArrayCopyExam {

	public static void main(String[] args) {
		
		
		// 커피전문점 1호점 판매하는 메뉴
		String[] coffee = new String[3];
		coffee[0] = "따아";
		coffee[1] = "라떼";
		coffee[2] = "말차";
		
		// 커피 2호점에서 1호점과 똑같은 커피를 판매할껍니다
		/*
		 * 얕은 복사 shallow copy, thin clone, call by reference
		 * stack영역의 값(주소)만 복사
		 * 원본이 바뀌면 당연히도 내 값도 바뀜
		 * 
		 */
		String[] coffee2 = coffee;
		
		for(int i = 0; i< coffee2.length ; i++) {
			System.out.println(coffee2[i]);
		}
		
		// 얕은 복사로 연결되어있기 때문에
		// 내껄 바꿔도 원본이 바뀐다
		// 같은 주소를 공유하기 때문에
		coffee2[1] = "연유라떼";
		System.out.println("coffee2[1]을 바꾸고 원본인 coffee출력");
		for(int i = 0; i< coffee.length ; i++) {
			System.out.println(coffee[i]);
		}
		
		
//		coffee3[0] = coffee[0];
		/*
		 * 깊은 복사 , deep copy, deep clone, call by value
		 * heap 영역의 새로운 주소에 자리를 마련하고 변수에 주소를 넣는다
		 * 그리고 원본의 값들을 복사해서 채워넣는다
		 * 그래서 원본과 동일한게 생기지만 전혀 다른 주소를 가지게 된다
		 * 즉, 내 값을 바꿔도 원본과 관계 없음.
		 */
		
		System.out.println();
		
		String[] coffee3 = new String[coffee.length + 1];
		coffee3[3]= "사라다빵";
		for(int i = 0; i < coffee3.length; i++) {
			System.out.println(coffee3[i]);
			
			
		}
		System.out.println();
////		coffee3[3]= "사라다빵";
//		for(int i = 0; i < coffee3.length; i++) {
//			System.out.println(coffee3[i]);
//		}
//		
//		for(int i = 0; i< coffee2.length ; i++) {
//			System.out.println(coffee[i]);
//		}
		
		
		
		
		
		// 전략 : coffee의 크기보다 1개 많은 새로운 배열을 만들고
		// 앞에서부터 복사해 놓고
		// 마지막에 추가할 값을 적어보자
		
		coffee3 = new String[coffee.length + 1];
		for(int i = 0; i < coffee.length; i++) {
			coffee3[i] = coffee[i];
		}
		coffee3[3] = "사라다빵";
		for(int i = 0; i< coffee3.length; i++) {
			System.out.println(coffee3[i]);
		}
		
		System.out.println();
		
		coffee3 = new String[coffee.length + 1];
//		int a = 2;
		for(int i= 0; i<2; i++) {
			coffee3[i]=coffee[i];
			coffee3[3]=coffee[2];
		}
		coffee3[2] = "사라다빵";
		for(int i = 0; i< coffee3.length; i++) {
			System.out.println(coffee3[i]);
		}
		
		
		
		System.out.println("향상된 for 문");
		// 향상된 for 문
		for ( String menu : coffee3 ) {
			System.out.println(menu);
		}
		
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		
		
		

	}

}
