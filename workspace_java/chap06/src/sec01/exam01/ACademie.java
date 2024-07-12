package sec01.exam01;

public class ACademie {
	Student[] Students = new Student[10];
	String Aname;
	
	
	int count;
	
	ACademie(String a) {
		Aname = a;
	}
	void join(Student s) {
		if(count < Students.length) {
			Students[count] = s;
			count++;
		}else {
			System.out.println("정원이 다 찼습니다.");
		}
	}
	void viewList() {
		for(int i=0;i<Students.length;i++) {
			Student s = Students[i];
			if(s != null) {
			System.out.println("이름 : "+s.name+"  나이 :"+s.age);
			}
		}
	}

//	String join(String name){
//		for(int i = 0 ; i < Students.length; i++) {
//			if(Students[i]==null) {
//				Students[i] = s1.Students();
//			}
//		}
//		return Students[0];
//	}
	
	
	
	
}
