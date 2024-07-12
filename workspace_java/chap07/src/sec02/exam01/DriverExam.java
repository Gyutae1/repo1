package sec02.exam01;

public class DriverExam {

	public static void main(String[] args) {
		
		Avante avante = new Avante();
		
		Driver driver = new Driver();
		
		
		Spark spark = new Spark();
//		driver.runSpark(spark);
		

		driver.run(spark);
		driver.run(avante);
	}

}
