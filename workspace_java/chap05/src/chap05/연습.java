package chap05;

import java.util.Scanner;

public class 연습 {

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
		System.out.println("1. 커피메뉴 | 2. 논커피메뉴 | 3. 장바구니 | 4.결제하기 | 5.종료");
		int M = 0; // 총 금액
		int A = 0; // 낸 금액
		int J = 0; // 추가 금액
		int m = 0; // 메뉴 while
		int O = 0; // 옵션 while
		int C = 0; // 음료 총 갯수
		int W = 0; // 휘핑크림
		int D = 0; // 결제화면에서 선택
 		String P = "";
//			for(int c = 0; c <= 4; c++) 
			while (true){
				int c = 0; // 메인 메뉴 선택
				c = scan.nextInt();
				if(c == 1) {
					System.out.println("원하시는 메뉴를 선택해주세요.");
					System.out.println("1. 아메리카노 (4000) | 2.카페라떼(4500) | 3.바닐라라떼(5000) | 4.카페모카(5000) | 5.처음으로 돌아가기");
					
					Outter : while (true) {
						m = scan.nextInt();
						if(m == 1) {
//							for(int o = 0; o <= 2; o++)
							 while (true) {
								System.out.println("음료는 차갑게 드릴까요, 따듯하게 드릴까요?");
								System.out.println("1. Iced | 2. Hot | 3. 처음으로 돌아가기");
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
								} else if(O == 3) {
									System.out.println("1. 커피메뉴 | 2. 논커피메뉴 | 3. 장바구니 | 4.결제하기 | 5.종료");
									break Outter;
								} else {
									System.out.println(O +"는 없는 옵션입니다. 다시 선택해주세요");
								} 
							}
							System.out.println("1. 아메리카노 (4000) | 2.카페라떼(4500) | 3.바닐라라떼(5000) | 4.카페모카(5000) | 5.처음으로 돌아가기");
						} else if (m == 2) {
							while (true) {
								System.out.println("음료는 차갑게 드릴까요, 따듯하게 드릴까요?");
								System.out.println("1. Iced | 2. Hot | 3. 처음으로 돌아가기");
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
								} else if(O == 3) {
									System.out.println("1. 커피메뉴 | 2. 논커피메뉴 | 3. 장바구니 | 4.결제하기 | 5.종료");
									break Outter;
								} else {
									System.out.println(O +"는 없는 옵션입니다. 다시 선택해주세요");
								}
							}
							System.out.println("1. 아메리카노 (4000) | 2.카페라떼(4500) | 3.바닐라라떼(5000) | 4.카페모카(5000) | 5.처음으로 돌아가기");
						} else if (m == 3) {
							while (true) {
								System.out.println("음료는 차갑게 드릴까요, 따듯하게 드릴까요?");
								System.out.println("1. Iced | 2. Hot | 3. 처음으로 돌아가기");
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
								} else if(O == 3) {
									System.out.println("1. 커피메뉴 | 2. 논커피메뉴 | 3. 장바구니 | 4.결제하기 | 5.종료");
									break Outter;
								} else {
									System.out.println(O +"는 없는 옵션입니다. 다시 선택해주세요");
								}
							}
							System.out.println("1. 아메리카노 (4000) | 2.카페라떼(4500) | 3.바닐라라떼(5000) | 4.카페모카(5000) | 5.처음으로 돌아가기");
						} else if (m == 4) {
							while (true) {
								System.out.println("음료는 차갑게 드릴까요, 따듯하게 드릴까요?");
								System.out.println("1. Iced | 2. Hot | 3. 처음으로 돌아가기");
								O = scan.nextInt();
								if(O == 1) {
									while(true) {
										System.out.println("휘핑크림 올려드릴까요?(500)");
										System.out.println("1.예 | 2.아니오 | 3.처음으로 돌아가기");
										W = scan.nextInt();
										if(W == 1) {
											System.out.println("휘핑크림을 추가하셨습니다");
											System.out.println("ice카페모카(크림o)를 추가하셨습니다");
											P += "ice카페모카(크림o),";
											M += 5500;
											C++;
											break;
										} else if(W == 2) {
											System.out.println("ice카페모카를 추가하셨습니다");
											P += "ice카페모카,";
											M += 5000;
											C++;
											break;
										} else if(W == 3) {
											System.out.println("1. 커피메뉴 | 2. 논커피메뉴 | 3. 장바구니 | 4.결제하기 | 5.종료");
											break Outter;
										} else {
											System.out.println(W +"는 없는 옵션입니다. 다시 선택해주세요");
										}
									}
									break;
									
								} else if(O == 2) {
									while(true) {
										System.out.println("휘핑크림 올려드릴까요?(500)");
										System.out.println("1.예 | 2.아니오 | 3.처음으로 돌아가기");
										W = scan.nextInt();
										if(W == 1) {
											System.out.println("휘핑크림을 추가하셨습니다");
											System.out.println("Hot카페모카(크림o)를 추가하셨습니다");
											P += "Hot카페모카(크림o),";
											M += 5500;
											C++;
											break;
										} else if(W == 2) {
											System.out.println("Hot카페모카를 추가하셨습니다");
											P += "Hot카페모카,";
											M += 5000;
											C++;
											break;
										} else if(W == 3) {
											System.out.println("1. 커피메뉴 | 2. 논커피메뉴 | 3. 장바구니 | 4.결제하기 | 5.종료");
											break Outter;
										} else {
											System.out.println(W +"는 없는 옵션입니다. 다시 선택해주세요");
										}
									}
									break;
								} else if(O == 3) {
									System.out.println("1. 커피메뉴 | 2. 논커피메뉴 | 3. 장바구니 | 4.결제하기 | 5.종료");
									break Outter;
								} else {
									System.out.println(O +"는 없는 옵션입니다. 다시 선택해주세요");
								}
							}
							System.out.println("1. 아메리카노 (4000) | 2.카페라떼(4500) | 3.바닐라라떼(5000) | 4.카페모카(5000) | 5.처음으로 돌아가기");
						} else if (m == 5) {
							System.out.println("메뉴선택을 종료했습니다");
							System.out.println("1. 커피메뉴 | 2. 논커피메뉴 | 3. 장바구니 | 4.결제하기 | 5.종료");
							break;
						} else {
							System.out.println("정확한 메뉴의 버튼을 눌러주세요!");
						}
					} // 여기까지 1번 메뉴선택 while문!
				} else if (c == 2) {
					System.out.println("원하시는 메뉴를 선택해주세요.");
					System.out.println("1. 레몬에이드 only Ice (5500) | 2.청포도에이드 only Ice (5500) | 3.말차라떼(5000) | 4.초코라떼(5000) | 5.처음으로 돌아가기");
					Outter : while (true) {
						m = scan.nextInt();
						if(m == 1) {
							System.out.println("레몬에이드를 추가하셨습니다.");
							P += "레몬에이드,";
							M += 5500;
							C++;
							System.out.println("1. 레몬에이드 only Ice (5500) | 2.청포도에이드 only Ice (5500) | 3.말차라떼(5000) | 4.초코라떼(5000) | 5.처음으로 돌아가기");
						} else if (m == 2) {
							System.out.println("청포도에이드를 추가하셨습니다.");
							P += "청포도에이드,";
							M += 5500;
							C++;
							System.out.println("1. 레몬에이드 only Ice (5500) | 2.청포도에이드 only Ice (5500) | 3.말차라떼(5000) | 4.초코라떼(5000) | 5.처음으로 돌아가기");
						} else if (m == 3) {
							while (true) {
								System.out.println("음료는 차갑게 드릴까요, 따듯하게 드릴까요?");
								System.out.println("1. Iced | 2. Hot | 3. 처음으로 돌아가기");
								O = scan.nextInt();
								if(O == 1) {
									System.out.println("Ice말차라떼를 추가하셨습니다");
									P += "Ice말차라떼,";
									M += 5000;
									C++;
									break;
								} else if(O == 2) {
									System.out.println("Hot말차라떼를 추가하셨습니다");
									P += "Hot말차라떼,";
									M += 5000;
									C++;
									break;
								} else if(O == 3) {
									System.out.println("1. 커피메뉴 | 2. 논커피메뉴 | 3. 장바구니 | 4.결제하기 | 5.종료");
									break Outter;
								} else {
									System.out.println(O +"는 없는 옵션입니다. 다시 선택해주세요");
								}
							}
							System.out.println("1. 레몬에이드 only Ice (5500) | 2.청포도에이드 only Ice (5500) | 3.말차라떼(5000) | 4.초코라떼(5000) | 5.처음으로 돌아가기");
						} else if (m == 4) {
							while (true) {
								System.out.println("음료는 차갑게 드릴까요, 따듯하게 드릴까요?");
								System.out.println("1. Iced | 2. Hot | 3. 처음으로 돌아가기");
								O = scan.nextInt();
								if(O == 1) {
									while(true) {
										System.out.println("휘핑크림 올려드릴까요?(500)");
										System.out.println("1.예 | 2.아니오 | 3.처음으로 돌아가기");
										W = scan.nextInt();
										if(W == 1) {
											System.out.println("휘핑크림을 추가하셨습니다");
											System.out.println("Ice초코라떼(크림o)를 추가하셨습니다");
											P += "ice초코라떼(크림o),";
											M += 5500;
											C++;
											break;
										} else if(W == 2) {
											System.out.println("Ice초코라떼를 추가하셨습니다");
											P += "ice초코라떼,";
											M += 5000;
											C++;
											break;
										} else if(O == 3) {
											System.out.println("1. 커피메뉴 | 2. 논커피메뉴 | 3. 장바구니 | 4.결제하기 | 5.종료");
											break Outter;
										} else {
											System.out.println(W +"는 없는 옵션입니다. 다시 선택해주세요");
										}
									}
									break;
									
								} else if(O == 2) {
									while(true) {
										System.out.println("휘핑크림 올려드릴까요?(500)");
										System.out.println("1.예 | 2.아니오 | 3.처음으로 돌아가기");
										W = scan.nextInt();
										if(W == 1) {
											System.out.println("휘핑크림을 추가하셨습니다");
											System.out.println("Hot초코라떼(크림o)를 추가하셨습니다");
											P += "Hot초코라떼(크림o),";
											M += 5500;
											C++;
											break;
										} else if(W == 2) {
											System.out.println("Hot초코라떼를 추가하셨습니다");
											P += "Hot초코라떼,";
											M += 5000;
											C++;
											break;
										} else if(W == 3) {
											System.out.println("1. 커피메뉴 | 2. 논커피메뉴 | 3. 장바구니 | 4.결제하기 | 5.종료");
											break Outter;
										} else {
											System.out.println(W +"는 없는 옵션입니다. 다시 선택해주세요");
										}
									}
									break;
								} else {
									System.out.println(O +"는 없는 옵션입니다. 다시 선택해주세요");
								}
							}
							System.out.println("1. 레몬에이드 only Ice (5500) | 2.청포도에이드 only Ice (5500) | 3.말차라떼(5000) | 4.초코라떼(5000) | 5.처음으로 돌아가기");
						} else if (m == 5) {
							System.out.println("메뉴선택을 종료했습니다");
							System.out.println("1. 커피메뉴 | 2. 논커피메뉴 | 3. 장바구니 | 4.결제하기 | 5.종료");
							break;
						} else {
							System.out.println("정확한 메뉴의 버튼을 눌러주세요!");
						}
					}
				} else if (c == 3) {
					System.out.println("주문하신 메뉴는 "+ P + " 총 " + C +" 잔으로");
					System.out.println("총 금액은 "+ M +" 원 입니다.");
					System.out.println("1. 커피메뉴 | 2. 논커피메뉴 | 3. 장바구니 | 4.결제하기 | 5.종료");
				} else if (c == 4) {
//					System.out.println("메뉴와 금액을 확인해주시고 금액을 입력해주세요");
					System.out.println("메뉴는 "+ P + " 총 " + C+ " 잔으로 ");
					System.out.println("총 금액은 "+ M +" 입니다.");
					System.out.println("결제를 도와드릴까요?");
					System.out.println("1. 예 | 2. 아뇨! 더 주문하겠습니다.");
					D = scan.nextInt();
					Outter : while(true) {
						if(D == 1) {
							System.out.println("메뉴와 금액을 확인해주시고 금액을 입력해주세요");
							System.out.println("메뉴는 "+ P + " 총 " + C+ " 잔으로 ");
							System.out.println("총 금액은 "+ M +" 입니다.");
							A = scan.nextInt();
							if(A == M) {
								System.out.println("감사합니다. 다음에 또 방문해주세요.");
								System.out.println("다음 손님 들어오세요~");
								System.out.println("1. 커피메뉴 | 2. 논커피메뉴 | 3. 장바구니 | 4.결제하기 | 5.종료");
								P = "";
								M = 0;
								C = 0;
								break;
							} else if (A > M && A > 0) {
								System.out.println("거스름돈 "+ (A-M) +"입니다. 안녕히 가세요!");
								System.out.println("다음 손님 들어오세요~");
								System.out.println("1. 커피메뉴 | 2. 논커피메뉴 | 3. 장바구니 | 4.결제하기 | 5.종료");
								P = "";
								M = 0;
								C = 0;
								break;
							} else if (A < M && A > 0) {
								System.out.println("총 금액 "+M+" 원 중 "+A+" 원 받았습니다 "+(M-A)+" 원이 부족합니다 ");
								System.out.println("추가 금액 "+(M-A)+"를 입력해주세요");
								J = scan.nextInt();
								while (true) {
									if((M-A) == J) {
										System.out.println("추가 금액"+J+"원 받았습니다.");
										System.out.println("감사합니다 다음에 또 방문해주세요");
										System.out.println("다음 손님 들어오세요~");
										System.out.println("1. 커피메뉴 | 2. 논커피메뉴 | 3. 장바구니 | 4.결제하기 | 5.종료");
										P = "";
										M = 0;
										C = 0;
										break Outter;
									} else if(J > (M-A)) {
										System.out.println("거스름돈 "+ (J-(M-A)) +"입니다. 안녕히 가세요!");
										System.out.println("다음 손님 들어오세요~");
										System.out.println("1. 커피메뉴 | 2. 논커피메뉴 | 3. 장바구니 | 4.결제하기 | 5.종료");
										P = "";
										M = 0;
										C = 0;
										break Outter;
									} else if (J < 0) {
										System.out.println("돈을 왜 훔쳐가요");
										System.out.println("다시 결제 부탁드립니다");
										System.out.println("1. 커피메뉴 | 2. 논커피메뉴 | 3. 장바구니 | 4.결제하기 | 5.종료");
										break Outter;
									}
								}
							} else if (A < 0) {
								System.out.println("돈을 왜 훔쳐가요");
								System.out.println("다시 결제 부탁드립니다");
								System.out.println("1. 커피메뉴 | 2. 논커피메뉴 | 3. 장바구니 | 4.결제하기 | 5.종료");
								break;
							}
						} else if (D == 2) {
							System.out.println("1. 커피메뉴 | 2. 논커피메뉴 | 3. 장바구니 | 4.결제하기 | 5.종료");
							break;
						} else {
							System.out.println("정확한 메뉴의 버튼을 눌러주세요!");
							D = scan.nextInt();
						}
					}
				} else if (c == 5) {
					System.out.println("방문해 주셔서 감사합니다. 다음에 또 오세요!");
					System.out.println("다음 손님 들어오세요~");
					System.out.println("1. 커피메뉴 | 2. 논커피메뉴 | 3. 장바구니 | 4.결제하기 | 5.종료");
					P = "";
					M = 0;
					C = 0;
					continue;
					
				} else {
					System.out.println("정확한 메뉴의 버튼을 눌러주세요!");
				}
			}
	}

}





