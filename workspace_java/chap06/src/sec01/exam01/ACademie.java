package sec01.exam01;

public class ACademie {
	Student[] Students = new Student[10];
	String Aname;
	
	
	int count;
	
	ACademie(String a) {
		Aname = a;
	}
	void join(Student s) {
		Students[count] = s;
		count++;	
	}
	void viewList() {
		for(int i=0;i<Students.length;i++) {
			System.out.println(Students[i]);
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
