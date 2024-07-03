package sec04.exam05;
// 전원 켜기 기능
// 전원 끄기 기능
// 각 전원 상태 값을 변경
// 약풍 기능
// 강풍 기능
// 전원이 켜진 상태에서만 바람 나옴
public class Fan {
	
	boolean isOn = false;
	
	void PowerOff() {
		System.out.println("전원을 끕니다");
		isOn = false;
	}
	void PowerOn() {
		System.out.println("전원을 켭니다");
		isOn = true;
	}
	void Power1() {
		if(isOn == true) {
			System.out.println("약풍으로 실행합니다");
		} else if (isOn == false) {
			System.out.println("선풍기 전원을 켜주세요");
			
		}
	}
	void Power2() {
		if(isOn == true) {
			System.out.println("강풍으로 실행합니다");
		} else if (isOn == false) {
			System.out.println("선풍기 전원을 켜주세요");
			
		}
	}
}
