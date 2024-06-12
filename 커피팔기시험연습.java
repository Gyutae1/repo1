package 복습;

import java.util.Scanner;

public class 커피팔기시험연습 {

	public static void main(String[] args) {
		
		// 어서오세요 00커피입니다.
		// 아메리카노,카페라떼,바닐라라떼,카페모카
		// ICED or HOT 고르기
		// 추가 옵션 연하게,샷추가, 카페모카를 고를경우 휘핑크림 추가옵션+1
		// 추가 옵션 구현하기***
		// 추가 옵션 구현하기***
		// 추가 옵션 구현하기***
		// 추가 옵션 구현하기***
		// 추가 옵션 구현하기***
		// 추가 옵션 구현하기***
		// 추가 옵션 구현하기***
		// 추가 옵션 구현하기***
		// 장바구니에 담고 추가로 고를 수 있게
		
		Scanner scan = new Scanner(System.in);
		System.out.println("어서오세요 00커피입니다.");
		System.out.println("1. 메뉴 | 2. 장바구니 | 3.결제하기 | 4.종료");
		int M = 0; // 총 금액
		int A = 0; // 낸 금액
		int J = 0; // 추가 금액
		int m = 0; // 메뉴 while
		int O = 0; // 옵션 while
		int C = 0; // 음료 총 갯수
//		int P = 0;
		String P = "";
			for(int c = 0; c <= 4; c++) {
				
				c = scan.nextInt();
				if(c == 1) {
					System.out.println("원하시는 메뉴를 선택해주세요.");
					System.out.println("1. 아메리카노 (4000) | 2.카페라떼(4500) | 3.바닐라라떼(5000) | 4.카페모카(5000) | 5.메뉴선택 종료하기");
					
					while (true) {
						m = scan.nextInt();
						if(m == 1) {
//							for(int o = 0; o <= 2; o++)
							while (true) {
								System.out.println("음료는 차갑게 드릴까요, 따듯하게 드릴까요?");
								System.out.println("1. Iced | 2. Hot");
								O = scan.nextInt();
								if(O == 1) {
									System.out.println("ice아메리카노를 추가하셨습니다");
									P += "ice아메리카노,";
									M += 4000;
									C++;
									break;
								} else if(O == 2) {
									System.out.println("Hot아메리카노를 추가하셨습니다");
									P += "Hot아메리카노,";
									M += 4000;
									C++;
									break;
								} else {
									System.out.println(O +"는 없는 옵션입니다. 다시 선택해주세요");
								}
							}
							System.out.println("1. 아메리카노 (4000) | 2.카페라떼(4500) | 3.바닐라라떼(5000) | 4.카페모카(5000) | 5.메뉴선택 종료하기");
						} else if (m == 2) {
							while (true) {
								System.out.println("음료는 차갑게 드릴까요, 따듯하게 드릴까요?");
								System.out.println("1. Iced | 2. Hot");
								O = scan.nextInt();
								if(O == 1) {
									System.out.println("ice라떼를 추가하셨습니다");
									P += "ice라떼,";
									M += 4500;
									C++;
									break;
								} else if(O == 2) {
									System.out.println("Hot라떼를 추가하셨습니다");
									P += "Hot라떼,";
									M += 4500;
									C++;
									break;
								} else {
									System.out.println(O +"는 없는 옵션입니다. 다시 선택해주세요");
								}
							}
							System.out.println("1. 아메리카노 (4000) | 2.카페라떼(4500) | 3.바닐라라떼(5000) | 4.카페모카(5000) | 5.메뉴선택 종료하기");
						} else if (m == 3) {
							while (true) {
								System.out.println("음료는 차갑게 드릴까요, 따듯하게 드릴까요?");
								System.out.println("1. Iced | 2. Hot");
								O = scan.nextInt();
								if(O == 1) {
									System.out.println("ice바닐라라떼를 추가하셨습니다");
									P += "ice바닐라라떼,";
									M += 5000;
									C++;
									break;
								} else if(O == 2) {
									System.out.println("Hot바닐라라떼를 추가하셨습니다");
									P += "Hot바닐라라떼,";
									M += 5000;
									C++;
									break;
								} else {
									System.out.println(O +"는 없는 옵션입니다. 다시 선택해주세요");
								}
							}
							System.out.println("1. 아메리카노 (4000) | 2.카페라떼(4500) | 3.바닐라라떼(5000) | 4.카페모카(5000) | 5.메뉴선택 종료하기");
						} else if (m == 4) {
							while (true) {
								System.out.println("음료는 차갑게 드릴까요, 따듯하게 드릴까요?");
								System.out.println("1. Iced | 2. Hot");
								O = scan.nextInt();
								if(O == 1) {
									System.out.println("ice카페모카를 추가하셨습니다");
									P += "ice카페모카,";
									M += 5000;
									C++;
									break;
								} else if(O == 2) {
									System.out.println("Hot카페모카를 추가하셨습니다");
									P += "Hot카페모카,";
									M += 5000;
									C++;
									break;
								} else {
									System.out.println(O +"는 없는 옵션입니다. 다시 선택해주세요");
								}
							}
							System.out.println("1. 아메리카노 (4000) | 2.카페라떼(4500) | 3.바닐라라떼(5000) | 4.카페모카(5000) | 5.메뉴선택 종료하기");
						} else if (m == 5) {
							System.out.println("메뉴선택을 종료했습니다");
							System.out.println("1. 메뉴 | 2. 장바구니 | 3.결제하기 | 4.종료");
							break;
						} else {
							System.out.println("정확한 메뉴의 버튼을 눌러주세요!");
						}
					} // 여기까지 1번 메뉴선택 while문!
				} else if (c == 2) {
					System.out.println("주문하신 메뉴는 "+ P + " 총 " + C +" 잔으로");
					System.out.println("총 금액은 "+ M +" 원 입니다.");
				} else if (c == 3) {
					System.out.println("메뉴와 금액을 확인해주시고 금액을 입력해주세요");
					System.out.println("메뉴 "+ P + " 총 " + C+ " 잔으로 ");
					System.out.println("총 금액은 "+ M +" 입니다.");
					A = scan.nextInt();
					if(A == M) {
						System.out.println("감사합니다. 다음에 또 방문해주세요.");
						break;
					} else if (A > M) {
						System.out.println("거스름돈 "+ (A-M) +"입니다. 안녕히 가세요!");
						break;
					} else if (A < M) {
						System.out.println("총 금액 "+M+" 원 중 "+A+" 원 받았습니다 "+(M-A)+" 원이 부족합니다 ");
						System.out.println("추가 금액 "+(M-A)+"를 입력해주세요");
						J = scan.nextInt();
						while (true) {
							if((M-A) == J) {
								System.out.println("추가 금액"+J+"원 받았습니다.");
								System.out.println("감사합니다 다음에 또 방문해주세요");
								break;
							} else if(J > (M-A)) {
								System.out.println("거스름돈 "+ (J-(M-A)) +"입니다. 안녕히 가세요!");
								break;
							}
						}
					}
				}
			}
	}

}
