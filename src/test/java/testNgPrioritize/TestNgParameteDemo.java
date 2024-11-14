package testNgPrioritize;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameteDemo {

	@Test
	@Parameters({"myname"})
	public void Test(@Optional("Default Value!") String name) {
		System.out.println("Her name is : "+ name);
	}
}
