package demo4j;

public class ExeptionHandling {

	public static void main(String[] args) {
		
		try {
			System.out.println("start the system1");
			int i=1/0;
			System.out.println("end the system1");
		} catch (Exception e) {

			System.out.println("error : "+e.getMessage());
		}


	}
}
