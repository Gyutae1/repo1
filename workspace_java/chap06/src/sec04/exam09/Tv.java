package sec04.exam09;

public class Tv {
	boolean isOn = false;
	int Volume;
	int Channel;
	void PowerOff() {
		System.out.println("전원을 끕니다");
		isOn = false;
	}
	void PowerOn() {
		System.out.println("전원을 켭니다");
		isOn = true;
	}
	void volume(String V) {
			if(V =="up") {
				if(Volume < 10) {
				Volume++;
				System.out.println("현재 음량은"+Volume+"입니다.");
				} else {
				System.out.println("볼륨이 너무 높습니다.");
				}
			} else if (V =="down") {
				if(Volume > 0) {
				Volume--;
				System.out.println("현재 음량은"+Volume+"입니다.");
				} else {
					System.out.println("현재 음량이 너무 낮습니다");
				}
			}
	}
	void channel(String C,int x) {
		if(x > 0) {
			Channel = x;
			System.out.println(Channel+"번입니다.");
		}else if(x == 0){
			if(C =="up") {
				Channel++;
				System.out.println(Channel+"번입니다.");
			}else if (C =="down") {
				Channel--;
				System.out.println(Channel+"번입니다.");
			}
		}
	}
	void tvInp() {
		System.out.println("현재 전원상태 :"+isOn);
		System.out.println("볼륨:"+Volume);
		System.out.println("채널 정보 출력 :"+Channel);
	}
}
